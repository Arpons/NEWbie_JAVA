import java.util.Scanner;

public class Ex32 {

	public static void main(String[] args) {
		int inputNum;
		int sum = 0;
		int count = 0;
		Scanner scan = new Scanner(System.in);
		System.out.println("숫자를 입력 하세요 : ");
		inputNum = scan.nextInt();
		for (int number1 = 1; number1 <= inputNum; number1++) {
			for (int number2 = number1; number2 <= inputNum; number2++) {
				sum += number2;
				if (sum == inputNum) {
					count++;

					break;
				}

			}
			sum = 0;
		}
		System.out.println(count);

	}

}
