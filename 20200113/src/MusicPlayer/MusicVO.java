package MusicPlayer;

public class MusicVO {
	private String musicName;
	private String singer;
	private int playtime;
	private String musicPath;

	public MusicVO(String musicName, String singer, int playtime, String musicPath) {
		this.musicName = musicName;
		this.singer = singer;
		this.playtime = playtime;
		this.musicPath = musicPath;
	}

	public String getMusicPath() {
		return musicPath;
	}

	public String getMusicName() {
		return musicName;
	}

	public String getSinger() {
		return singer;
	}

	public int getPlaytime() {
		return playtime;
	}

}
