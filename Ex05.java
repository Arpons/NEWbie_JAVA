import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
		// 더치페이 계산기
		// 금액과 인원수를 입력 받아 한 명이 내야하는 금액을 출력!(소수점까지!)
		
		Scanner scan = new Scanner(System.in);
		int money = 0;
		int cnt = 0;
		double result = 0;
		System.out.print("금액을 입력 해주세요 : ");
		money = scan.nextInt();
		System.out.print("인원을 입력 해주세요 : ");
		cnt = scan.nextInt();
		result = ((double)money / cnt);
		result = ((int)(result * 100)/100.0);
		
		System.out.println("1 인당 " + result + " 입니다.");

	}

}
