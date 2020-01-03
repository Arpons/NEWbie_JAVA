import java.util.Scanner;

public class Ex05 {
	public static void main(String[] args) {
		int rowNumber = 0;
		Scanner scan = new Scanner(System.in);
		System.out.print("행 개수 :");
		rowNumber = scan.nextInt();
		
		for (int line = 1; line <= rowNumber; line++) {
			for (int star = 1; star <= line; star++) {
				System.out.print("*");
			}
		}System.out.println();
		
		
	}

}
