import java.util.Scanner;

public class Ex13 {
	public static void main(String[] args) {
		int input;

		Scanner scan = new Scanner(System.in);
		System.out.print("정수 N 입력 : ");
		input = scan.nextInt();
		int[][] array = new int[input][input];
		int num1 = 1;
		int value;
		for (int indexFirst = 0; indexFirst < input; indexFirst++) {
			for (int indexSeconds = 0; indexSeconds < input; indexSeconds++) {

				array[indexSeconds][indexFirst] = num1++;
			}
		}
		for (int indexFirst = 0; indexFirst < input; indexFirst++) {
			for (int indexSeconds = 0; indexSeconds < input; indexSeconds++) {
				value = array[indexFirst][indexSeconds];
				System.out.print(value + "\t");

			}
			System.out.println(" ");

		}
	}
}
