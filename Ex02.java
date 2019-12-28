import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		// 입력 하는 법
		// 입력을 수행하는 위한 도구생성
		//1. 도구 생성 -> Ctrl + shift + o 
		Scanner scan = new Scanner(System.in);
		
		//2. 정수 입력 받기
		int number = scan.nextInt();
		// number = 0; -> 이미 만들어진 number라는 공간에 0을 대입해라(참조)
		// int number -> number라는 공간을 만들고 0을 대입해라
		
		//3. 입력한 정수를  x5 한 결과 값은?
		System.out.println(number * 5);
		 number = 0;
		System.out.println(number);
		
		

	}

}
