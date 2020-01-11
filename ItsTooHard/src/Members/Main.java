package Members;
import java.util.ArrayList;
import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		MembersDAO dao = new MembersDAO();
		Scanner scan = new Scanner(System.in);

		while(true) {
			System.out.println("1.회원가입 2.로그인");
			switch (scan.nextInt()) {
			case 1:
				System.out.println("ID 입력 : ");
				String id = scan.next();
				System.out.println("PassWord 입력 : ");
				String pw = scan.next();
				System.out.println("이름 입력 : ");
				String name = scan.next();
				System.out.println("전화번호  입력: ");
				String phone = scan.next();
				System.out.println("생일 입력 : ");
				int birth = scan.nextInt();
				dao.join(id, pw, name, phone, birth);
				dao.disconnect();
				break;
			case 2:
				System.out.println("ID 입력 : ");
				id = scan.next();
				System.out.println("PassWord 입력 : ");
				pw = scan.next();
				ArrayList<MembersDTO> result = dao.login(id,pw);
				dao.login(id,pw);
				dao.disconnect();
				for(int i = 0; i<result.size(); i++) {
					if (result.get(i).getId().equals(id) && result.get(i).getPw().equals(pw)) {
						System.out.println(id+ "님 로그인이 되었습니다.");
					}
				}
				break;
			default:
				System.out.println("다시 시도해 주세요");
				break;
			}
		}

	}

}
