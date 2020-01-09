package Machine;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		DrinkVO[] allMenu = { new DrinkVO("콜라", 5, 800), new DrinkVO("생수", 5, 700), new DrinkVO("비타민워터", 5, 1500) };
		int[] coins = { 1000, 500, 100 };
		Scanner scan = new Scanner(System.in);

		Machine m1 = new Machine(allMenu);

		System.out.println("=========== 자판기 ============");
		System.out.print("돈 입력  >>");
		int money = scan.nextInt();

		m1.insertCoin(money);// 돈 입력 //

		while (true) {

			m1.showMenu(); // 메뉴 출력 //
			System.out.println(">>");
			int choice = scan.nextInt(); // 메뉴 선택 //

			m1.selling(choice); // 메뉴 판매
			int coin = m1.getMoney();

			System.out.println("잔액 : " + coin);

			if (coin >= 500) {
				System.out.println("계속 하시겠습니까? (y/n)");
				String con = scan.next();
				if (con.contentEquals("n")) {
					System.out.println("프로그램종료");
					break;
				}
			} else {
				break;
			}

		}
		m1.showChange(coins);

	}

}
