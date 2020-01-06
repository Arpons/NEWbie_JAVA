package Ex01;

public class PocketmonVO {
	// 포켓몬의 속성
	// 이름(String), 속성(String), 번호(int), 공격력(int), 필살기(String)
	private String name;
	private String type;
	private int num;
	private int attack;
	private String skill;
	
	// 메소드 정의
	// 객체를 생성할 떄 반드시 호출되는 메서드;
	// 생성자
	// 1. 메서드의 이름이 클래스의 이름과 같다.
	// 2. 리턴 타입이 없음.
	public PocketmonVO(String name, String type, int attack,  String skill, int num) {
		this.name = name;
		this.type = type;
		this.num = num;
		this.attack = attack;
		this.skill = skill;
	}
	
	public void setAttack(int attack) {
		this.attack = attack;
		 
	}
	public int getAttack() {
		System.out.println(attack);
		return attack;
	}
	
	
}
