package MusicPlayer;

import java.util.Scanner;

public class MusciPlayerMain {

	public static void main(String[] args) {
		MusicPlayer MusicPlayer = new MusicPlayer();
		
		Scanner scan = new Scanner(System.in);
		int menu;
		while (true) {
			System.out.print("1.재생 2.정지 3.다음곡 4.이전곡 5.종료 >>");
			menu = scan.nextInt();
			
			if (menu == 1) {
				// 재생
				MusicVO temp = MusicPlayer.play();
				System.out.println(printMusicInfo(temp));
			} else if (menu == 2) {
				// 정지
				String message = MusicPlayer.stop();
				System.out.println(message);

			} else if (menu == 3) {
				// 다음곡
				MusicVO temp = MusicPlayer.nextPlay();
				if( temp != null) {
					System.out.println(printMusicInfo(temp));
				} else {
					System.out.println("다음 곡이 없습니다.");
				}
				
			} else if (menu == 4) {
				// 이전곡
				MusicVO temp = MusicPlayer.prePlay();
				if( temp != null) {
					System.out.println(printMusicInfo(temp));
				} else {
					System.out.println("이전 곡이 없습니다.");
				}
			} else {
				// 프로그램 종료
				MusicPlayer.stop();
				System.out.println("프로그램 종료");
				break;
			}
		}

		/*
		 * while (true) { System.out.print("1.재생 2.정지 3.다음곡 4.이전곡 5.종료 >>"); menu =
		 * scan.nextInt(); switch (menu) { case 1: break; case 2: break; case 3: break;
		 * case 4: break; case 5: System.out.println("프로그램 종료"); break; default: break;
		 * 
		 * } }
		 */

	}

	public static String printMusicInfo(MusicVO temp) {
		return temp.getMusicName() + ", " + temp.getSinger() + ", " + changeTime(temp);
	}

	public static String changeTime(MusicVO temp) {
		return (temp.getPlaytime() / 60)
				+ "분" + (temp.getPlaytime() % 60) + "초";
	}
}
