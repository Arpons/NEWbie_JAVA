import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		int sum = 0;
		int count = 0;
		
		for (int i = 77; i > 0; i--) {
			count += 1;
			sum += (i * count);
		}
		System.out.println(sum);
		

	}

}
