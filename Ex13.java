package ee;

import java.util.Scanner;

public class Ex13 {

	public static void main(String[] args) {
		int totalScore = 0;
		char grades;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("점수를 입력하세요 : ");
		totalScore = scan.nextInt();
		
		if (totalScore >= 90 ) {
			grades = 'A';
		} else if (totalScore >= 80) {
			grades = 'B';
		} else if (totalScore >= 70) {
			grades = 'C';
		} else {
			grades = 'D';
		}
		System.out.println(grades + "학점 입니다.!");

	}

}
