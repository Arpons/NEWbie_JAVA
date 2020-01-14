package edu.smhrd.opgame.model;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public class MemberDAO extends BaseDAO {

	public MemberDTO login(String id, String pw) {
		MemberDTO result = null;
		connect();
		String sql = "update opg_member set islogined='1' where id=? and pw =?";
		try {
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, id);
			psmt.setString(2, pw);
			int cnt = psmt.executeUpdate();
			if (cnt > 0) {
				rs = conn.createStatement().executeQuery(String.format("select id, islogined from opg_member where id ='%s'",id));
				while(rs.next()) {
					String rid = rs.getString(1);
					boolean rIsLogined = rs.getBoolean(2);
					result = new MemberDTO(rid, rIsLogined);
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}
		return result;
	}

	public int join(String id, String pw) {
		int cnt = 0;
		connect();
		String sql = "insert into OPG_MEMBER(id,pw) values(?,?)";
		try {
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, id);
			psmt.setString(2, pw);
			cnt = psmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}
		return cnt;

	}

	

	public MemberDTO logout(String id) {
		MemberDTO result = null;
		connect();
		String sql = "update opg_member set islogined='0' where id=? ";
		try {
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, id);
			
			int cnt = psmt.executeUpdate();
			if (cnt > 0) {
				rs = conn.createStatement().executeQuery(String.format("select id, islogined from opg_member where id ='%s'",id));
				while(rs.next()) {
					String rid = rs.getString(1);
					boolean rIsLogined = rs.getBoolean(2);
					result = new MemberDTO(rid, rIsLogined);
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}
		return result;
	}

}
