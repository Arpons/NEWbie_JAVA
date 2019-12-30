package ee;

import java.util.Scanner;

public class Ex06 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		 int money = 0; // 잔돈
		 int cnt = 0; // 각 화폐의 개수
		 // 각 화폐들
		 int[] coins = {10000, 5000, 1000, 500, 100};
		 // 배열 생성, 배열의 이름은 복수로 작성
		
		 int a = 5;
		 int b = a++;
		 System.out.println(a);
		 System.out.println(b);
		 int c = ++a;
		 System.out.println(c);
		 System.out.println("[잔돈 계산기]");
		 System.out.println("거스름 돈 >>> ");
		 money = scan.nextInt();
		 
		 for(int i = 0; i < coins.length; i++) {
			 cnt = money / coins[i];
			 System.out.println(coins[i] + "원  개수 >>>" + cnt);
			 money %= coins[i];
		 }
		 
	}

}