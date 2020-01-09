package Auto;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		MenuVO coke = new MenuVO ("콜라", 800, 6);
		MenuVO wator = new MenuVO ("생수", 500, 6);
		MenuVO vitamin = new MenuVO("비타민", 1500, 6);
		MenuVO[] arr = {coke, wator, vitamin};
		
		
		
		// 자판기 프로그램
		// 음료수(이름, 가격, 재고}
		int money;
		int select;
		String ox;
		Scanner scan = new Scanner(System.in);
		System.out.print("돈 입력 >> ");
		money = scan.nextInt();
		while(true) {
			
			
			for (int i = 0; i < arr.length; i++) {
				System.out.print((i+1) +". "+ arr[i].getName() + " 가격 : " +arr[i].getPrice() + " 재고 : " + arr[i].getStock() + " : ");
			}
			select = scan.nextInt();
			select -= 1;
			if(money >= arr[select].getPrice() && arr[select].getStock() != 0) {
				System.out.println(arr[select].getName() + "가 나옵니다.");
			}
			// 재고 부족 및 잔액 부족
			if (arr[select].getStock() == 0) {
				System.out.println("남은 수량이 없습니다.");
			} else if(money < arr[select].getPrice()) {
				System.out.println("돈이 부족합니다.");
			}
			// 돈 감소 및 수량 감소//
			money -= arr[select].getPrice();
			arr[select].setStock(arr[select].getStock() - 1);
			System.out.println("잔돈  : " + money);
			System.out.println("계속 하시겠습니다까? (y/n)");
			ox = scan.next();
			if (ox.equals("n" )) {
				// 잔돈  계산기 사용
				int[] coins = {1000, 500, 100};
				changeMoney(money, coins);
				
				System.out.println("자판기 종료");
				break;
				
			} else if (money < 500){
				System.out.println("자판기 종료");
				break;
				
			} else {
				continue;
			}
		}
	}
	
	/// 잔돈 계산기 ////
	public static void changeMoney(int money, int[] coins) {
		
		int cnt = 0;
		for (int i = 0; i < coins.length; i++) {
			cnt = money / coins[i];
			System.out.println(coins[i] + "원 : " + cnt);
			money = money % coins[i];
			
		}
		System.out.print("잔액 : " + money);
		System.out.println("잔돈 : " + money);
		
		
	}
}
