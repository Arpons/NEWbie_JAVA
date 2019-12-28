import java.util.Scanner;

public class Ex03 {
	public static void main(String[] args) {
		// 곱셈 계산기
		// 숫자 두개를 입력 받아 두 수의 곱셈 해보기
		Scanner scan = new Scanner(System.in);
		// 변수의 초기화 
		int num1 = 0;  // 입력 받을 첫 번째 수
		int num2 = 0;  // 입력 받을 두 번째수
		int result = 0;  // 결과가 저장될 변수
		
		System.out.println("[곱셈 계산기]");
		System.out.print("첫 번째 숫자를 입력하세요 : ");
		num1 = scan.nextInt();
		System.out.print("두 번째 숫자를 입력하세요 : ");
		num2 = scan.nextInt();
		
		result = num1 * num2;
		//연산과 출력은 별도로 해준다.
		
		System.out.println("결과는 " + result + " 입니다.");
	}

}
