import java.util.Random;

public class Ex11 {

	public static void main(String[] args) {
		int[] numbers = new int[8];
		int minValue = 0, maxValue = 0;
		Random random = new Random();
		System.out.print("배열에 있는 모든 값 : ");
		for (int index = 0; index < numbers.length; index++) {
			numbers[index] = random.nextInt(50);
			System.out.print(numbers[index] + " ");
			if (index == 0) {
				minValue = numbers[index];
				maxValue = numbers[index];
			}
			if (minValue > numbers[index]) {
				minValue = numbers[index];
			
			}
			if (maxValue < numbers[index]) {
				maxValue = numbers[index];
			}
		}
		System.out.println();
		System.out.println("가장 큰 값 : " + maxValue);
		System.out.println("가장 작은 값 " + minValue);
		

	}

}