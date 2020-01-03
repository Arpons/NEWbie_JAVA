import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int now, goal, weight;
		int count = 0;
		System.out.print("현재 몸무게 : ");
		now = scan.nextInt();
		System.out.print("목표 몸무게 : ");
		goal = scan.nextInt();
		
		while (true) {
			count += 1;
			System.out.print(count + "주차 강량 몸무게 : ");
			weight = scan.nextInt();
			now -= weight;
			if (now <= goal) {
				System.out.println(now + "kg 달성!! 축하합니다!");
				break;
			}
		}

	}

}
