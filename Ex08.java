package ee;

import java.util.Scanner;

public class Ex08 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int age = 0;

		System.out.println("[미성년자 판별기}");
		System.out.println("나이 >>> ");
		age = scan.nextInt();

		if (age >= 20) {
			System.out.println("성인입니다.");
		} else {
			System.out.println("미성년자 입니다.");
		}

	}

}
