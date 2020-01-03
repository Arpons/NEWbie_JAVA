import java.util.Scanner;

public class Ex09 {

	public static void main(String[] args) {
		int num = 0;
		int result = 0;
		Scanner scan = new Scanner(System.in);
		System.out.print("숫자 입력 : ");
		num = scan.nextInt();
		
		result = num % (num / 10);
		
		if (result < 5 ) {
			result = (num / 10) * 10;
		} else {
			result = (num / 10) * 10 + 10;
		}
		System.out.println("반올림 수 : " + result);
		
		
		

	}

}
