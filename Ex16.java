package ee;

import java.util.Random;
import java.util.Scanner;

public class Ex16 {

	public static void main(String[] args) {
		int num;
		Random random = new Random();
		int ran = random.nextInt(50)+1;
		
			
		while (true) {
			Scanner scan = new Scanner(System.in);
			System.out.print("숫자를 입력하세요. :");
			num = scan.nextInt();
			if (ran > num) {
				System.out.println(num + " 보다 큰 수 입니다.");
			}else if(ran < num) {
				System.out.println(num + " 보다 작은 수 입니다.");
			}else {
				System.out.println("정답은 " + ran + " 입니다.");
				break;
			}
		}
		
		

	}

}
