package 도서관리프로그램;

public class idVO {
	private String id;       // 회원 이름
	private String password; // 비밀 번호

	public idVO(String id, String password) {

		this.id = id;
		this.password = password;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
