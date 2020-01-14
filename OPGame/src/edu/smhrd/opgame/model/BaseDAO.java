package edu.smhrd.opgame.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class BaseDAO {
	Connection conn = null;
	PreparedStatement psmt = null;
	ResultSet rs = null; 
	public void connect() {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String id = "hr";
			String pw = "hr";
			conn = DriverManager.getConnection(url, id, pw);
			if (conn != null) {
				System.out.println("연결 성공!");
			}
		} catch (ClassNotFoundException e) {
			System.out.println("바보");
			e.printStackTrace();
		} catch (SQLException e) {
			System.out.println("멍청이");
			e.printStackTrace();
		}
		

	}
	public void disconnect() {
		try {
			if(rs != null) rs.close();
			if(psmt != null) psmt.close();
			if(conn != null) conn.close();
		} catch (SQLException e) {
			System.err.println("commit ERR");
			e.printStackTrace();
		}

	}
	
}
