
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Select {

	public static void main(String[] args) {
		PreparedStatement ps = null;
		Connection conn = null;
		Scanner scan = new Scanner(System.in);
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String id = "hr";
			String pw = "hr";
			conn = DriverManager.getConnection(url, id, pw);
			if (conn != null) {
				System.out.println("연결 성공!");
			}
			String sql = "SELECT * FROM MEMBER";
			ps = conn.prepareStatement(sql);
			// rs : 커서 -> 행,열 위치를 가르킴
			// rs.next(); ->커서 한칸이동 -> 데이터가 존재하면 True 없으면 False
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				String name = rs.getString(1);
				String phoneNum = rs.getString(2);
				int age = rs.getInt(3);
				System.out.println(name + " " + phoneNum + " " + age);
			}
			
			
			
		} catch (ClassNotFoundException e) {
			System.err.println("오타났어요... ");
			e.printStackTrace();
		} catch (SQLException e) {
			System.err.println("계정 또는 Url 틀렸어요...");
			e.printStackTrace();
		} finally {
			try {
				ps.close();
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

	}

}
