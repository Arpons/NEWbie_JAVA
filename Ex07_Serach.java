
public class Ex07_Serach {
	public static void main(String[] args) {
		int[] arr = { 1, 7, 16, 25, 30, 33, 41, 66, 78, 90 };
		int num = 80;
		int lowIndex = 0;
		int highIndex = arr.length - 1;

		while (true) {
			int index = (lowIndex + highIndex) / 2;

			if (num == arr[index]) {
				System.out.println(num + "은(는)" + index + "번째에 있습니다.");
				break;
			} else if (num > arr[index]) {
				lowIndex = index + 1;
			} else if (num < arr[index]) {
				highIndex = index - 1;
			}
			if (highIndex < lowIndex) {
				System.out.println("fails");
				break;

			}

		}

	}
}
