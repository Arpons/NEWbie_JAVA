package edu.smhrd.opgame.service;

public class OPGame {

	private String _question;
	private int _remainingAnswers = 3;
	private int _a;
	private int _b;
	private IOperator _op;
	String[] msg = {"한번 더 해보자." ,"다시 한번 볼까.", "잘 봐보자." };

	public OPGame(IOperator op) {
		_op = op;
	}
	public void makeQuestion(int max) {
		_op.generateQuestion(10);
	}

	public void makeQuestion() {
		_op.setA(1);
		_op.setB(1);
		
		
		this._question = String.format("%d + %d = ", _a, _b);
		_remainingAnswers = 3;
		
	}

	public String getQuestion() {
		return _op.getQuestion();
	}

	public int getRemainingAnswers() {
		
		return this._remainingAnswers;
	}

	public boolean isAnswer(int n) {
		_remainingAnswers--;
		return _op.isEquals(n);
	}

	public String getCheeringUpMsg() {
		
		return msg[2 - _remainingAnswers];
	}

}
