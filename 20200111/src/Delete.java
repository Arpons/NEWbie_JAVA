import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Delete {

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
			String sql = "DELETE MEMBER WHERE NAME = ?";
			ps = conn.prepareStatement(sql);
			
			while (true) {
				System.out.println("[1] 삭제 [2] 종료");
				int check = scan.nextInt();
				if (check == 2) {
					System.out.println("종료");
					break;
				}
				System.out.println("이름 입력  : ");
				String name = scan.next();
				ps.setString(1, name);
				int cnt = ps.executeUpdate();
				if (cnt > 0) {
					System.out.println("삭제완료!");
				}
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
