package Game;

import java.util.Random;
import java.util.Scanner;

public class Main2 {

	public static void main(String[] args) {
		int answer;
		int numFirst;
		int numSecond;
		int count = 0;
		int life = 3;
		int max = 10;
		Scanner scan = new Scanner(System.in);
		Random random = new Random();
		numFirst = random.nextInt(max) + 1;
		numSecond = random.nextInt(numFirst) + 1;

		String[] word = { "....?", "멍청이...", "에유..." };
		String goodMessage = "참 잘했어요 :)";
		
		for (int i = 0; i < life;) {
			numFirst = random.nextInt(max) + 1;
			numSecond = random.nextInt(max) + 1;
			System.out.println(numFirst + " - " + numSecond + " = ");
			System.out.println("정답 입력 : ");
			answer = scan.nextInt();
			
			if (answer == numFirst - numSecond ) {
				System.out.println(goodMessage);
			} else {
				System.out.println(word[i++]);
			}
		}

	}

}
