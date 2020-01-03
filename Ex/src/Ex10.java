import java.util.Scanner;

public class Ex10 {

	public static void main(String[] args) {
		int input1, input2 ;
		int repeat = 1;
		int LCM;
		int value1, value2;
		Scanner scan = new Scanner(System.in);
		System.out.print("숫자1입력 >>");
		input1 = scan.nextInt();
		System.out.print("숫자2입력 >>");
		input2 = scan.nextInt();
		
		value1 = input1;
		value2 = input2;
		if (input1 < input2) {
			input1 = value2;
			input2 = value1;
		}
		
		while (repeat > 0) {
			repeat = input1 % input2;
			input1 = input2;
			input2 = repeat;
		}
		LCM = value1*value2/input1;
		System.out.println("최대공약수" + input1);
		System.out.println("최소공배수" + LCM);

	}

}
