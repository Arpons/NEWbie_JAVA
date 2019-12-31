package ee;

import java.util.Scanner;

public class Ex17 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int now, tomorrow, count = 0, weight;

		System.out.print("현재 몸무게를 입력하세요 : ");
		now = scan.nextInt();
		
		while (true) {
			System.out.print("목표 몸무게를 입력하세요 : ");
			tomorrow = scan.nextInt();
			if (now < tomorrow) {
				System.out.println("다시 입력해 주세요 ");
			} else {
				break;
			}
		}

		while (true) {
			System.out.print(++count + "주차 감량 몸무게 >> : ");
			weight = scan.nextInt();
			now -= weight;
			System.out.println(now);

			if (now <= tomorrow) {
				System.out.println(now + "kg달성! 축하합니다.");
				break;
			}
		}
	}
}
