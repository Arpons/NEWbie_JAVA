package edu.smhrd.opgame.service;

public class PlusOperatorLevelOne implements IOperator {
	int a, b;

	@Override
	public void generateQuestion(int max) {
		a = (int) (Math.random() * max);
		b = (int) (Math.random() * (max - a));
	}

	@Override
	public void setB(int i) {
		b = i;

	}

	@Override
	public void setA(int i) {
		a = i;

	}

	@Override
	public String getQuestion() {
		return String.format("%d + %d = ", a, b);
	}

	@Override
	public boolean isEquals(int n) {
		// TODO Auto-generated method stub
		return n == (a + b);
	}

}
