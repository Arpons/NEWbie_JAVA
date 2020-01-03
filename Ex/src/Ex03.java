
public class Ex03 {

	public static void main(String[] args) {
		int sw = -1;
		int result = 1;
		int sum = 0;
		for (int i = 1; i <= 100; i++) {
			sw *= -1;
			result = i * sw;
			System.out.println(result);
		}
		System.out.println(sum);

	}
}
