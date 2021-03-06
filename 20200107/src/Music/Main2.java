package Music;

import java.util.ArrayList;
import java.util.Scanner;

public class Main2 {

	public static void main(String[] args) {
		MusicList one = new MusicList("title", "singer", "time");
		ArrayList<MusicList> playList= new ArrayList<MusicList>();
		ArrayList<MusicPlayList> musicPlayList = new ArrayList<MusicPlayList>();
		Scanner scan = new Scanner(System.in);
		int num;
		int count = 0;
		String playListName;
		String musicTitle;
		String title;
		String singer;
		String time;
		
		while(true) {
			System.out.println("========== MusicPlayer ==========");
			System.out.println("[1]추가 [2]삭제 [3]검색 [4]PlayList 생성 [5]PlayList 조회 [6]종료");
			num = scan.nextInt();
			if(num == 1) {
				System.out.println("제목을 입력하세요 : ");
				title = scan.next();
				System.out.println("가수르 입력하세요 : ");
				singer = scan.next();
				System.out.println("재생시간을 입력하세요 : ");
				time = scan.next();
				System.out.println("PlayList 선택 : ");
				System.out.println("playList 조회");
				for(int i = 0; i < musicPlayList.size(); i++) {
					System.out.println(musicPlayList.get(i).getListName());
				}
				
				MusicList name = new MusicList(title, singer, time);
				playList.add(name);
				// 곡 출력 
				for(int i = 0; i < playList.size(); i++) {
					System.out.println(i + " " + " 제목  : " + playList.get(i).getTitle() + " 가수 :" +playList.get(i).getSinger() + " 재생시간 :" + playList.get(i).getTime());
				}
				
			}else if(num == 2) {
				System.out.println("삭제 하고싶은 곡 이름 : ");
				musicTitle = scan.next();
				// 곡 삭제
				
				for(int i = 0; i < playList.size(); i++) {
					if(playList.get(i).getTitle().equals(musicTitle)) {
						playList.remove(i);
						System.out.println("해당 곡이 삭제되었습니다.");
						count++;
					} else if (count >= playList.size()){
						System.out.println("해당 곡을 찾을 수 없습니다.");
					}
					
				}count = 0;
			}else if(num == 3) {
				System.out.println("검색 하고싶은 곡 이름 : ");
				musicTitle = scan.next();
				for(int i = 0; i < playList.size(); i++) {
					if(playList.get(i).getTitle().contains(musicTitle)) {
						System.out.println(i + " " + " 제목  : " + playList.get(i).getTitle() + " 가수 :" +playList.get(i).getSinger() + " 재생시간 :" + playList.get(i).getTime());
						
					}
				}
			}else if(num == 4) {
				// playLsit 생성
				System.out.println("playList 이름을 입력해주세요 : ");
				playListName = scan.next();
				MusicPlayList allList = new MusicPlayList(playListName, playList);
				musicPlayList.add(allList);
				
			}else if(num == 5) {
				System.out.println("playList 조회");
				for(int i = 0; i < musicPlayList.size(); i++) {
					System.out.println(musicPlayList.get(i).getListName());
				}
			}
			else {
				System.out.println("프로그램 종료");
				break;
				
			}
			
			
		}

	}
	

}
