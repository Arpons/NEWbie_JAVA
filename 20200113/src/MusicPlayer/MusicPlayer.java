package MusicPlayer;

import java.util.ArrayList;

import javazoom.jl.player.MP3Player;

public class MusicPlayer {
	ArrayList<MusicVO> musicList = new ArrayList<MusicVO>();
	MP3Player mp3 = new MP3Player();
	
	int curIndex = 0;

	public MusicPlayer() {
		musicList.add(new MusicVO("DallaDalla", "ltzy", 100, "C://music/Itzy - Dalla Dalla.mp3"));
		musicList.add(new MusicVO("깡", "Rain", 120,"C://music/Rain - 깡.mp3"));
		musicList.add(new MusicVO("SOLO", "Jennie", 200,"C://music/JENNIE - SOLO.mp3"));
	}

	public MusicVO play() {
		if(mp3.isPlaying()) {
			mp3.stop();
		}
		mp3.play(musicList.get(curIndex).getMusicPath());
		return musicList.get(curIndex);
	}

	public String stop() {
		mp3.stop();
		return "노래가 정지되었습니다.";
	}

	public MusicVO nextPlay() {
		
		if (curIndex >= musicList.size() - 1) {
			return null;
		} else {
			curIndex += 1;
			play();
			return musicList.get(curIndex);
		}

	}

	public MusicVO prePlay() {
		if (curIndex <= 0) {
			return null;
		} else {
			curIndex -= 1;
			play();
			return musicList.get(curIndex);
		}

	}

}
