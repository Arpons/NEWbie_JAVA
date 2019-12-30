package ee;

import java.util.Scanner;

public class Ex11 {

	public static void main(String[] args) {
		int work, time, salary = 0;
		int pay = 5000;
	
		System.out.println("[시급 계산기]");
		Scanner sc = new Scanner(System.in);
		System.out.print("노동시간을 입력하세요 : ");
		work = sc.nextInt();
		time = work - 8;
		
		if (work <= 8) {
			salary =  work * pay;
		} else {
			salary = (int)(8 * pay + time * pay * 1.5);
		}
		System.out.println("총 임금은 " + salary + "입니다.");
		
		

	}

}
