package Main;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex {

	public static void main(String[] args) {
		PocketMonVO mon1 = new PocketMonVO("피카츄", "전기", "백만볼트", 116, 200);
		PocketMonVO mon2 = new PocketMonVO("파이리", "불", "화염방사", 102, 1213);
		PocketMonVO mon3 = new PocketMonVO("이상해씨", "나무", "아몰라", 222, 333);
		ArrayList<PocketMonVO> arr = new ArrayList<PocketMonVO>();
		Scanner scan = new Scanner(System.in);
		int num, attack, shield;
		String deletePocketMon, name, type, skill;

		arr.add(mon1);
		arr.add(mon2);
		arr.add(mon3);
		PocketMon mon = new PocketMon()

	}

}
