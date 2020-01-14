package edu.smhrd.opgame.service;

public interface IOperator {

	void generateQuestion(int i);

	void setB(int i);

	void setA(int i);

	String getQuestion();

	boolean isEquals(int n);

}
