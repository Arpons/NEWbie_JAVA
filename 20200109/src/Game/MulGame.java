package Game;

import java.util.Random;

public class MulGame extends OperCD {

	public MulGame(String[] word, String goodMessage, int life, int max) {
		super(word, goodMessage, life, max);
		
	}

	@Override
	public void makeRandom() {
		Random random = new Random();
		numFirst = random.nextInt(max) + 1;
		numSecond = random.nextInt(max) + 1;

	}

	@Override
	public String getQue() {
		return numFirst + "*" + numSecond + " = ";
	}

	@Override
	public boolean isOK(int answer) {
		return answer == numFirst * numSecond;
	}

}
