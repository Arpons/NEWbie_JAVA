import java.util.Arrays;

public class Ex05 {

	public static void main(String[] args) {
		int[] numbers = { 45, 7, 12, 82, 25 };
		int temp;
/*
		if (numbers[0] > numbers[1]) {
			temp = numbers[0];
			numbers[0] = numbers[1];
			numbers[1] = temp;
		}
		if (numbers[1] > numbers[2]) {
			temp = numbers[1];
			numbers[1] = numbers[2];
			numbers[2] = temp;
		}
		if (numbers[2] > numbers[3]) {
			temp = numbers[2];
			numbers[2] = numbers[3];
			numbers[3] = temp;
		}
		if (numbers[3] > numbers[4]) {
			temp = numbers[3];
			numbers[3] = numbers[4];
			numbers[4] = temp;
		}
*/
		System.out.println(Arrays.toString(numbers));
		System.out.println("===== 1step =====");
		for (int index = 0; index < numbers.length - 1; index++) {
			if(numbers[index] > numbers[index+1]) {
				temp = numbers[index];
				numbers[index] = numbers[index+1];
				numbers[index+1] = temp;
			}
		}
		System.out.println(Arrays.toString(numbers));

	}

}
