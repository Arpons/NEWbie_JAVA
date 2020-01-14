package edu.smhrd.opgame.test;

import static org.junit.Assert.*;

import org.junit.Test;

import edu.smhrd.opgame.service.MinusOpratorLevelOne;
import edu.smhrd.opgame.service.OPGame;
import edu.smhrd.opgame.service.PlusOperatorLevelOne;

public class GameTest {

	@Test
	public void test() {
		OPGame game = new OPGame(new MinusOpratorLevelOne());
		game.makeQuestion();
		String question = game.getQuestion();
		assertEquals("1 + 1 = ", question);
		assertEquals(3, game.getRemainingAnswers());
		assertEquals(false, game.isAnswer(3));
		assertEquals(2, game.getRemainingAnswers());
		assertEquals("한번 더 해보자.", game.getCheeringUpMsg());
		assertEquals(true, game.isAnswer(2));
	}

}
