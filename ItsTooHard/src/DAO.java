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
			System.out.println("바보");
			e.printStackTrace();
		} catch (SQLException e) {
			System.out.println("멍청이");
			e.printStackTrace();
		}

	}

	public int join(String id, String pw, String name, String phone, int birth) {
		connect();
		int cnt = 0;
		String sql = "INSERT INTO members VALUES(?,?,?,?,?)";
		try {
			ps = conn.prepareStatement(sql);
			ps.setString(1, id);
			ps.setString(2, pw);
			ps.setString(3, name);
			ps.setString(4, phone);
			ps.setInt(5, birth);
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
			System.err.println("commit ERR");
			e.printStackTrace();
		}
		
	}

	
	public ArrayList<MembersDTO> login(java.lang.String id, java.lang.String pw) {
		
		ArrayList<MembersDTO> temp = new ArrayList<MembersDTO>();
		String sql = "SELECT * FROM MEMBERS WHRER id = ? AND password = ?";
		try {
			ps = conn.prepareStatement(sql);
			ps.setString(1, id);
			ps.setString(2, pw);
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				String ID = rs.getString(1);
				String password = rs.getString(2);
				String name = rs.getString(3);
				String phone = rs.getString(4);
				int birth = rs.getInt(5);
				
				MembersDTO dto = new MembersDTO(ID, password, name, phone, birth);
				
				temp.add(new MembersDTO(ID, password, name, phone, birth));
				return temp;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	

}
