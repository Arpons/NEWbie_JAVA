package ee;

import java.util.Scanner;

public class Ex10 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int money, total = 0;
		int cost = 10000;

		System.out.print("사려는 상품 갯수를 입력하세요 : ");
		total = scan.nextInt();

		if (total < 11) {
			money = total * cost;
		} else {
			money = (total * cost) - (total * cost * 10 / 100);
			
		}
		
		System.out.println("가격은 " + money + "원 입니다.");

	}

}