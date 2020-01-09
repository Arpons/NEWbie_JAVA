package 도서관리프로그램;

public class bookVO {
	private String title;  // 도서 제목
	private String  id;   // 대출자
	
	public bookVO(String title, String id) {
		this.title = title;
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
	
	

}
