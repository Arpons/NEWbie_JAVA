package ee;

import java.util.Scanner;

public class Ex09 {

	public static void main(String[] args) {
		int db, cal, os, date, soft, total = 0;
		Scanner scan = new Scanner(System.in);
		System.out.println("DB 점수를 입력 해주세요 : ");
		db = scan.nextInt();
		System.out.println("전자계산기 구조 점수를 입력 해주세요 : ");
		cal = scan.nextInt();
		System.out.println("OS 점수를 입력 해주세요 : ");
		os = scan.nextInt();
		System.out.println("데이터통신 점수를 입력 해주세요 : ");
		date = scan.nextInt();
		System.out.println("소프트웨어 점수를 입력 해주세요 : ");
		soft = scan.nextInt();
		
		total = db + cal + os + date + soft;
		//합격
		if (total  >= 60) {
			if (db < 8  || cal < 8 || os < 8 || date < 8 || soft < 8) {
				System.out.println("불합격입니다.");
			} else {
				System.out.println("합격입니다.");
			}
		} else {
			System.out.println("불합격 입니다.");
		}
		
		if (total >=60 && db > 7  && cal > 7 && os > 7 && date > 7 && soft > 7) {
			System.out.println("합격!");
		} else {
			System.out.println("불합격!!");
		}
		

	}

}
