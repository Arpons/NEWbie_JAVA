package Music;

public class MusicList {
	private String title;
	private String singer;
	private String time;

	public MusicList(String title, String singer, String time) {
		super(); // << 생략가능 << 디폴트 생성자 << 매개변수가 없음
		this.title = title;
		this.singer = singer;
		this.time = time;
	}

	public String getTitle() {
		return title;
	}

	
	public String getSinger() {
		return singer;
	}

	public String getTime() {
		return time;
	}

	

}
