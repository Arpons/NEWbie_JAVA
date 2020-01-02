import java.util.Arrays;

public class Ex06 {
	public static void main(String[] args) {
		int[] arr = { 1, 7, 70, 13, 14 };
		int max = arr[0];
		int maxIndex = 0;
		for (int i = 0; i < arr.length; i++) {
			max = arr[i];
			maxIndex = i;

			for (int j = 1; j < arr.length; j++) {
				if (max < arr[j]) {
					max = arr[j];
					maxIndex = j;

				}
			}
			int temp = arr[i];
			arr[i] = arr[maxIndex];
			arr[maxIndex] = temp;
			System.out.println(Arrays.toString(arr));
		}
	}

}
