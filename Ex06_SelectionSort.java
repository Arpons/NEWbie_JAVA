import java.util.Arrays;

public class Ex06_SelectionSort {
	public static void main(String[] args) {
		int[] arr = { 1, 7, 70, 13, 24 };
		int temp = 0;
		int standard = arr[0];
		int space;

		for (int step = 0; step < arr.length - 1; step++) {
			System.out.println("===== " + (step+1) + "step =====");
			standard = arr[step];
			for (int findIndex = step; findIndex < arr.length; findIndex++) {
				if (arr[findIndex] > standard) {
					temp = findIndex;
					standard = arr[temp];
				}
			}
			space = arr[step];
			arr[step] = arr[temp];
			arr[temp] = space;
			System.out.println(Arrays.toString(arr));

		}

	}

}
