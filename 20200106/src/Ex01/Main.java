package Ex01;

public class Main {

	public static void main(String[] args) {
		// 포켓몬 정보저장
		// 이름(String), 속성(String), 번호(int), 공격력(int), 필살기(String)
		// 사용자 정의 자료형(Value Object - VO)
		
		PocketmonVO pika = new PocketmonVO("피카츄", "전기", 120, "백만볼트", 25);
		/*
		 * pika.name = "피카츄"; pika.type = "전기"; pika.attack = 120; pika.skill = "백만볼트";
		 * pika.num = 25;
		 */
		pika.setAttack(pika.getAttack() + 100);
		
		
		PocketmonVO fairy = new PocketmonVO("파이리", " 불", 116, "화염방사", 4);
		/*
		 * fairy.name = "파이리"; fairy.type = "불"; fairy.attack = 116; fairy.skill =
		 * "화염방사"; fairy.num = 4;
		 */
		
		
	}

}
