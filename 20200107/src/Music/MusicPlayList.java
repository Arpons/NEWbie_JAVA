package Music;

import java.util.ArrayList;

public class MusicPlayList {
	private String listName;
	private ArrayList<MusicList> MusicPlayList = new ArrayList<MusicList>();
	
	

	public MusicPlayList(String listName, ArrayList<MusicList> musicPlayList) {
		super();
		this.listName = listName;
		MusicPlayList = musicPlayList;
	}
	public String getListName() {
		return listName;
	}

	public ArrayList<MusicList> getMusicPlayList() {
		return MusicPlayList;
	}

}
