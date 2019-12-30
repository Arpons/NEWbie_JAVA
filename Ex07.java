package ee;

import java.util.Scanner;

public class Ex07 {

	public static void main(String[] args) {
		 
		 Scanner scan = new Scanner(System.in);
		 
		 int ball = 0;	 
		 int boxSize = 5;
		 int result = 0;
		 
		 
		 System.out.println("농구공의 개수를 입력하세요 : ");
		 ball = scan.nextInt();
		 result = ball % boxSize == 0 ?  ball / boxSize : ball /  boxSize + 1;
		 System.out.println("필요한 상자 수: " +  result);

	}

}
