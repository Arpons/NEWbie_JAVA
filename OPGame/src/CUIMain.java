import java.util.Scanner;

public class CUIMain {
	// 1.덧셈
	// 2.기회 3번
	// 3.결과는 10이하
	public static void main(String[] args) {

		String[] msg = { "다시 한번 볼까.", "잘 봐보자.", "다음 문제를 볼까." };
		Scanner scan = new Scanner(System.in);

		startLevel(msg, scan, new PlusOperator());

	}

	private static void startLevel(String[] msg, Scanner scan, IOperator op) {
		op.generateQuestion();
		for (int i = 0; i < msg.length; i++) {
			int num = scan.nextInt();
			System.out.print(op.getQuestion());
			if (op.isEquals(num)) {
				System.out.println("정답입니다.");
				break;
			} else {
				System.out.println(msg[i]);
			}
		}
	}

}
