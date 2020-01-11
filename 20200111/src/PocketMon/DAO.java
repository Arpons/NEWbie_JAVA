package PocketMon;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class DAO {
	private Connection conn;
	private PreparedStatement ps;
	
	

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
			System.out.println("오타");
			e.printStackTrace();
		} catch (SQLException e) {
			System.out.println("바보");
			e.printStackTrace();
		}

	}

	public int insertPocketMon(int num, String name, String type, String location, int height, int weight) {
		connect();
		int cnt = 0;
		try {
			String sql = "INSERT INTO POCKETMON VALUES(?,?,?,?,?,?)";
			ps = conn.prepareStatement(sql);
			ps.setInt(1, num);
			ps.setString(2, name);
			ps.setString(3, type);
			ps.setString(4, location);
			ps.setInt(5, height);
			ps.setInt(6, weight);
			cnt = ps.executeUpdate();

		} catch (SQLException e) {
			System.out.println("ERR");
			e.printStackTrace();
		}
		return cnt;
	}

	public void disconnect() {
		try {
			ps.close();
			conn.close();
		} catch (SQLException e) {
			System.out.println("ERR");
			e.printStackTrace();
		}
	}

	public int deletePocketMon(String name) {
		connect();
		int cnt = 0;
		String sql = "DELETE POCKETMON WHERE NAME = ?";
		try {
			ps = conn.prepareStatement(sql);
			ps.setString(1, name);
			cnt = ps.executeUpdate();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return cnt;
	}
	public ArrayList<PocketDTO> selectPocketMon(String keyword) {
		ArrayList<PocketDTO> temp = new ArrayList<PocketDTO>();
		connect();
		int cnt = 0;
		String sql = "SELECT * FROM POCKETMON WHERE TYPE = ?";
		try {
			ps = conn.prepareStatement(sql);
			ps.setString(1, keyword);
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				int num = rs.getInt(1);
				String name = rs.getString(2);
				String type = rs.getString(3);
				String location = rs.getString(4);
				int height = rs.getInt(5);
				int weight = rs.getInt(6);
				
				PocketDTO dto = new PocketDTO(num, name, type, location, height, weight);
				
				temp.add(new PocketDTO(num, name, type, location, height, weight));
				return temp;
			}
		} catch (SQLException e) {
			System.out.println("아몰랑");
			e.printStackTrace();
		}
		return temp;
		
	} 
}
