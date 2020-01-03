import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		int work = 8;
		int time = 0;
		int pay = 5000;
		int result = 0;
		double rate = 1.5;
		
		Scanner scan = new Scanner(System.in);
		System.out.print("일한 시간은 입력하세요 : ");
		time = scan.nextInt();
		
		if (time > work) {
			result = (int)((work * pay) + (time - work) * pay * rate);
	    } else {
			result = time * pay;
		}
		System.out.println("총 임금은" + result + "원 입니다.");
		
		
		

	}

}
