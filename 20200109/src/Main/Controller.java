package Main;

import java.util.ArrayList;
import java.util.Scanner;

public class Controller {
	private PocketMonVO mon;

	public Controller() {
		this.mon = mon;
	}

	Scanner scan = new Scanner(System.in);
	ArrayList<PocketMonVO> arr = new ArrayList<PocketMonVO>();
	int num, attack, shield;
	String deletePocketMon, name, type, skill;

	public int add() {
		int num;
		for (int i = 0; i < arr.size(); i++) {
			System.out.println(arr.get(i));
		}
		System.out.println("[1] 추가 [2] 삭제 [3] 검색 ");
		num = scan.nextInt();
		return num;
	}

	public void inputOne() {
		System.out.println("이름 : ");
		name = scan.next();
		System.out.println("타입");
		type = scan.next();
		System.out.println("스킬");
		skill = scan.next();
		System.out.println("공격력");
		attack = scan.nextInt();
		System.out.println("방어력");
		shield = scan.nextInt();

		PocketMonVO temp = new PocketMonVO(name, type, skill, attack, shield);
		arr.add(temp);
		System.out.println("추가 되었습니다.");
		showPocketMon(arr);

	}

	private void showPocketMon(ArrayList<PocketMonVO> arr) {
		for (int i = 0; i < arr.size(); i++) {
			System.out.println(arr.get(i));
		}

	}

	public void inputTwo() {
		showPocketMon(arr);
		System.out.println("삭제하고 싶은 포켓몬 입력 : ");
		deletePocketMon = scan.next();
		deletePocketMon(arr, deletePocketMon);

	}

	private void deletePocketMon(ArrayList<PocketMonVO> arr, String deletePocketMon) {
		for (int i = 0; i < arr.size(); i++) {
			if (arr.get(i).getName().equals(name)) {
				arr.remove(i);
				System.out.println("삭제되었습니다.");
			}
		}

	}

	public void inputThree() {
		showPocketMon(arr);
		System.out.println("검색 할 포켓몬 입력 : ");
		String searchName = scan.next();
		searhPocketMon(arr, searchName);

	}

	private void searhPocketMon(ArrayList<PocketMonVO> arr, String searchName) {
		for (int i = 0; i < arr.size(); i++) {
			if (arr.get(i).getName().equals(searchName)) {
				System.out.println(arr.get(i));
				System.out.println("검색이 완료 되었습니다.");
			}
		}

	}
}
