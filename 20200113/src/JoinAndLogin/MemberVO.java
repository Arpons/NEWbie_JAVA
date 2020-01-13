package JoinAndLogin;

public class MemberVO {
	private String id;
	private String pw;
	private String name;
	private int age;
	
	public MemberVO(String id, String pw, String name, int age) {
		
		this.id = id;
		this.pw = pw;
		this.name = name;
		this.age = age;
	}

	public String getId() {
		return id;
	}

	public String getPw() {
		return pw;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}
	
	

}
