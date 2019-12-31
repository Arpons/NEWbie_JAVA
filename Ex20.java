package ee;

import java.util.Scanner;

public class Ex20 {

	public static void main(String[] args) {
		// 1 ~ 10까지 1씩 증가 하면서 출력

		/*
		 * for (int i = 1; i <= 10; i++) { System.out.println(i); }
		 * 
		 * // 50 부터 23 까지 출력
		 * 
		 * for (int j = 50; j >= 23; j--) { System.out.println(j); }
		 * 
		 * // 10부터 99까지 짝수 출력
		 * 
		 * for (int k = 5; k < 50; k++) { System.out.println(k * 2); } for (int k = 10;
		 * k <= 99; k += 2) { System.out.println(k); } for (int k = 10; k < 99; k++) {
		 * if (k % 2 == 0) { System.out.println(k); } }
		 */
		// 1 부터 100 까지 출력;
		/*
		 * for (int k = 1; k <= 100; k++) { System.out.println(k % 2 == 0 ? -k : k); }
		 int sw = -1;
		for (int k = 1; k <= 100; k++) {
			sw *= (-1);
			System.out.println("k: " + k + " sw: " + sw + " k*sw: " + k * sw);
		}
		for (int k = 1; k <= 100; k++, sw *=(-1)) {
			System.out.println(k * sw);
		}*/
		// 1 ~ 10까지 합 
		int sum = 0;
		for (int k = 1; k <= 10; k++) {
			sum += k;
			System.out.println(sum);
		}
		System.out.println("총 합은 " + sum);
	}

}
