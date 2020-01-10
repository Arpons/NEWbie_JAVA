package Game;

public abstract class OperCD {
	protected String[] word;
	protected String goodMessage;
	protected int life;
	protected int max;
	protected int numFirst;
	protected int numSecond;
	
	public OperCD(String[] word, String goodMessage, int life, int max) {
		this.word = word;
		this.goodMessage = goodMessage;
		this.life = life;
		this.max = max;
	}

	public abstract void makeRandom();

	public abstract String getQue();

	public abstract boolean isOK(int answer);

	public final int getLife() {
		return life;
	}

	public final String getGoodMessage() {
		return goodMessage;
	}

	public final String[] getWord() {
		return word;
	}

}
