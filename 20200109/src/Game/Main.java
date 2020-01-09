package Game;

import java.util.Random;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// Plus game
		// .1~10 숫자 랜덤 출력
		// 답 입력
		// 맞으면 '참 잘했어요!', 틀리면 '....?', '멍청이...', '에휴....'
		// 3번 틀리면 종료
		String[] word = { "....?", "멍청이...", "에유..." };
		String goodMessage = "참 잘했어요 :)";
		int life = 3;
		int max = 10;
		
		
		PlusGame cd = new PlusGame(word, goodMessage, life, max);
		Controller con1 = new Controller(cd);
		con1.start();
		
	


		
	}

}
