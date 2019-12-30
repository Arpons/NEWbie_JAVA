package ee;

import java.util.Scanner;

public class Ex15 {

	public static void main(String[] args) {
		int num;
		Scanner scan = new Scanner(System.in);
		while (true) {
			System.out.print("숫자 입력 : ");
			num = scan.nextInt();

			if (num >= 10) {
				System.out.print("종료합니다.");
				break;
			} else {
				System.out.println(num);
			}

		}
	}

}
