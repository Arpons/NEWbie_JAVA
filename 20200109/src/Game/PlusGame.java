package Game;

import java.util.Random;

public class PlusGame {
	private String[] word;
	private String goodMessage;
	private int life;
	private int max;
	private int numFirst;
	private int numSecond;

	public PlusGame(String[] word, String goodMessage, int life, int max) {
		this.word = word;
		this.goodMessage = goodMessage;
		this.life = life;
		this.max = max;
	}

	public int getLife() {
		return life;
	}

	public void makeRandom() {
		Random random = new Random();
		numFirst = random.nextInt(max) + 1;
		numSecond = random.nextInt(max) + 1;

	}

	public String getQue() {
		return numFirst + " + " + numSecond + " = ";
	}

	public boolean isOK(int answer) {
		return answer == numFirst + numSecond;
	}

	public String getGoodMessage() {
		return goodMessage;
	}

	public String[] getWord() {
		return word;
	}

}
