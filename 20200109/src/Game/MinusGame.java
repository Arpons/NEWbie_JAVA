package Game;

import java.util.Random;

public class MinusGame extends OperCD {

	public MinusGame(String[] word, String goodMessage, int life, int max) {
		super(word, goodMessage, life, max);
	}

	public void makeRandom() {
		Random random = new Random();
		numFirst = random.nextInt(max) + 1;
		numSecond = random.nextInt(numFirst) + 1;

	}

	public String getQue() {
		return numFirst + " - " + numSecond + " = ";
	}

	public boolean isOK(int answer) {
		return answer == numFirst - numSecond;
	}

}
