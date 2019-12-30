package ee;

import java.util.Scanner;

public class Ex14 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String grade = scan.next();
		
		if (grade.equals("A")) {
			System.out.println("90점에서 100점 입니다.");
		} else if (grade.equals("B")) {
			System.out.println("80점에서 89점 입니다.");
		} else if (grade.contentEquals("C")) {
			System.out.println("70점에서 89점 입니다.");
		} else if (grade.equals("C")) {
			System.out.println("60점에서 69점 입니다.");
		} else {
			System.out.println("0점에서 59점 입니다.");
		}

	}

}
