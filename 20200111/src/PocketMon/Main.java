package PocketMon;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// 포켓몬 도감 만들기!
		// 번호,이름,속성,출몰지역,키,몸무게
		// number, varchar, varchar, varchar,number,number;
		// 추가, 삭제, 검색
		
		DAO pd = new DAO();
		Scanner scan = new Scanner(System.in);
		while (true) {
			
			System.out.println("[1]추가, [2]삭제, [3]검색");
			switch (scan.nextInt()) {
			case 1:
				System.out.println("번호 입력 : ");
				int num = scan.nextInt();
				System.out.println("이름 입력 : ");
				String name = scan.next();
				System.out.println("타입 입력 : ");
				String type = scan.next();
				System.out.println("출몰지역 : ");
				String location = scan.next();
				System.out.println("키");
				int height = scan.nextInt();
				System.out.println("몸무게");
				int weight = scan.nextInt();
				pd.insertPocketMon(num,name,type,location,height,weight);
				pd.disconnect();

				break;
			case 2:
				System.out.println("이름 입력 : ");
				name = scan.next();
				pd.deletePocketMon(name);
				pd.disconnect();
				break;
			case 3:
				
				System.out.println("검색하고 싶은 type : ");
				String keyword = scan.next();
				ArrayList<PocketDTO> result = pd.selectPocketMon(keyword);
				pd.selectPocketMon(keyword);
				pd.disconnect();
				for(int i = 0; i<result.size(); i++) {
					result.toString();
				}
				break;
			default:
				System.out.println("다시 입력하세요!");
				break;
			}

		}

	}
		

}
