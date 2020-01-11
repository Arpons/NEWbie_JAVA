package Members;

public class MembersDTO {
	private String id;
	private String pw;
	private String name;
	private String phone;
	private int birth;
	
	public MembersDTO(String id, String pw, String name, String phone, int birth) {
		super();
		this.id = id;
		this.pw = pw;
		this.name = name;
		this.phone = phone;
		this.birth = birth;
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
	public String getPhone() {
		return phone;
	}
	public int getBirth() {
		return birth;
	}
	
	
	
	
	
	
}
