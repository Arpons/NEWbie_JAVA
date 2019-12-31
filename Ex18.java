package ee;

import java.util.Random;
import java.util.Scanner;

public class Ex18 {

	public static void main(String[] args) {
		int first, secound, num;
		
		while (true) {
			Random random = new Random();
			Scanner scan = new Scanner(System.in);
			first = random.nextInt(50)+1;
			secound = random.nextInt(50)+1;
			
			System.out.print(first + " + "  + secound  + "=" );
			num = scan.nextInt();
			
			if (first + secound == num) {
				System.out.print("GAME OVER!");
				break;
			} else {
				System.out.println("Fail...");
			}
		}
		
		

	}

}
