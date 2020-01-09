package 도서관리프로그램;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		String id;
		String password;
		String title;
		String name;
		int choise;
		int bookNumber;
		ArrayList<idVO> idList = new ArrayList<idVO>();
		ArrayList<bookVO> bookList = new ArrayList<bookVO>();
		bookList.add(new bookVO("백종원이 추천하는 밋집",""));
		bookList.add(new bookVO("미녀와 야수",""));
		bookList.add(new bookVO("으악 학교에 귀신이",""));
		bookList.add(new bookVO("용암에서 살아남기",""));
		bookList.add(new bookVO("남극에서 살아남기",""));
		
		Library library1 = new Library(idList, bookList);
		
		
		
		Scanner scan = new Scanner(System.in);
		System.out.println("========== 도서 관리 프로그램 =========");
		
		
		/// 회원 가입 
		
		while(true) {
			System.out.println("로그인을 하세요. 첫 방문을 하신 고객님은 회원가입을 하세요.");
			System.out.println("1. 회원가입 2.로그인 >> ");
			choise = scan.nextInt();
			if (choise == 1) {
				// 회원 가입
				System.out.print("아이디를 입력하세요 : ");
				id = scan.next();
				System.out.print("비밀 번호를 입력하세요 : ");
				password = scan.next();
				library1.join(id, password);
				if (library1.getCheck()) {
					System.out.println("회원가입이 완료 되었습니다.");
				} else {
					System.out.println("사용할 수 없는 아이디 입니다.");
				}
				
				
				
			}else {
			/// 로그인
				System.out.print("아이디를 입력하세요 : ");
				id = scan.next();
				System.out.print("비밀 번호를 입력하세요 : ");
				password = scan.next();
				library1.Login(id, password);
				if (library1.getCheck()) {
					System.out.println("로그인이 되었습니다.");
				} else {
					System.out.println("아이디 또는 비밀번호가 일치하지 않습니다.");
				}
				
			}
			if (library1.getCheck()) {
				System.out.println(id + "님 환영합니다.");
				System.out.println("1.도서 대출 2.도서 반납 3. 로그아웃");
				choise = scan.nextInt();
				if(choise == 1) {
					for (int i = 0; i < bookList.size(); i++) {
						if(bookList.get(i).getId().equals("")) {
							System.out.println(i + ". " + bookList.get(i).getTitle());
						}
					}
					/// 도서 대출
					System.out.println("책 선택  >> ");
					bookNumber = scan.nextInt();
					library1.borrowbook(bookNumber, id);
					if(library1.getCheck()) {
						System.out.println("대출이 되었습니다.");
					}else {
						System.out.println("대출이 실패 되었습니다.");
					}
				if (choise == 2) {
					/// 도서 반납
					for(int i = 0; i < bookList.size(); i++) {
						if(bookList.get(i).getId().contentEquals(id)) {
							System.out.println(i + ". " + bookList.get(i).getTitle());
						}
					}
					
					System.out.println("책 번호 선택 : ");
					bookNumber = scan.nextInt();
					library1.returnBook(bookNumber);
					System.out.println("반납 완료");
					for (int i = 0; i < bookList.size(); i++) {
						if(bookList.get(i).getId().equals("")) {
							System.out.println(i + ". " + bookList.get(i).getTitle());
						}
					}
				}
				else {
					System.out.println("프로그램 종료");
					break;
				}
					
					
					
				}
			}
		}
		
		

	}

}
