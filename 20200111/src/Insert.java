import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Insert {
	// 메서드 static 이면 객체 생성하지 않고 메서드를 실행할 수 있음
	// 메모리할당 공간 : static : 객체생성 x

	public static void main(String[] args) {
		// 0. ojdbc6.jar 파일 import - 프로젝트 마다 import
		// 1. Driver 로딩(객체 생성);
		// try 실행중, catch 클래스 찾지 못하면 실행
		Scanner scan = new Scanner(System.in);
		PreparedStatement ps = null;
		Connection conn = null;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			//2. connection 객체 얻어오기
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String id = "hr";
			String pw = "hr";
			conn = DriverManager.getConnection(url, id, pw);
			if (conn != null) {
				System.out.println("연결 성공!");
			}
			// 3. sql 쿼리문 준비
			String sql = "INSERT INTO MEMBER VALUES(?,?,?)";
			// MEMBER 테이블 정보 삽입 
			ps = conn.prepareStatement(sql);
			
			while(true) {
				System.out.println("[1] 추가 [2] 종료");
				int check = scan.nextInt();
				if(check == 2) {
					System.out.println( "종료");
					break;
				}
				System.out.println("이름 입력  : ");
				String name = scan.next();
				ps.setString(1, name);
				System.out.println("연락처 입력  : ");
				String phone = scan.next();
				ps.setString(2, phone);
				System.out.println("나이 입력  : ");
				int age = scan.nextInt();
				ps.setInt(3, age);
				int cnt = ps.executeUpdate();
				if (cnt > 0) {
					System.out.println("입력완료!");
				}
				
			}
			
			// 4. 쿼리문 전송
			 // insert , update 
			// executeQuery(); select
			
		} catch (ClassNotFoundException e) {
			System.err.println("오타났어요... ");
		} catch (SQLException e) {
			System.err.println("계정 또는 Url 틀렸어요...");
			e.printStackTrace();
		} finally {
			try {
				ps.close();
				conn.close();
			} catch(SQLException e){
				e.printStackTrace();
			}
		}

	}

}
