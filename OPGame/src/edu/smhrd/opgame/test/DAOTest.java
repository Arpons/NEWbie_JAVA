package edu.smhrd.opgame.test;

import static org.junit.Assert.*;

import org.junit.Test;

import edu.smhrd.opgame.model.MemberDAO;
import edu.smhrd.opgame.model.MemberDTO;

public class DAOTest {

	@Test
	public void test() {
		String id = "tester";
		String pw = "tester";
		
		MemberDAO dao = new MemberDAO();
		MemberDTO user = dao.login(id,pw);
		if(user == null) {
			dao.join(id,pw);
			user = dao.login(id,pw);
		}
		assertEquals(id, user.getID());
		assertTrue(user.isLogined());
		user = dao.logout(id);
//		assertFalse(user.isLogined());
	}

}
