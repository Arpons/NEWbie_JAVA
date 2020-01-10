package Game;

import java.util.Random;

public class SqureGame extends OperCD{

	public SqureGame(String[] word, String goodMessage, int life, int max) {
		super(word, goodMessage, life, max);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void makeRandom() {
		Random random = new Random();
		numFirst = random.nextInt(5)+1;
		numSecond = random.nextInt(5)+1;
		
	}

	@Override
	public String getQue() {
		// TODO Auto-generated method stub
		return numFirst + " * " + numSecond + " = ";
	}

	@Override
	public boolean isOK(int answer) {
		// TODO Auto-generated method stub
		return answer == numFirst * numSecond;
	}

}
