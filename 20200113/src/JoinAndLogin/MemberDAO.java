package JoinAndLogin;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class MemberDAO {
	private Connection conn = null;
	private PreparedStatement ps = null;
	private int cnt = 0;

	private void connect() {
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

	public String login_select(String id, String pw) {
		connect();
		String name = "";
		int cnt = 0;
		String sql = "SELECT NAME FROM MEMBERINFO WHERE ID = ? AND PASSWORD = ?";
		try {
			ps = conn.prepareStatement(sql);

			ps.setString(1, id);
			ps.setString(2, pw);
			ResultSet rs = ps.executeQuery();

			while (rs.next()) {
				name = rs.getString(1);
			}

		} catch (SQLException e) {
			System.out.println("ERR");
			e.printStackTrace();
		} finally {
			disconnect();
		}
		return name;
	}

	private void disconnect() {
		try {
			ps.close();
			conn.close();
		} catch (SQLException e) {
			System.err.println("commit ERR");
			e.printStackTrace();
		}

	}
}
