package Phone;

public class Phone {
	// final >> 설정 불가 , private >> 클래스 내에서만 접근 가능 , protected >> 자식 클래스까지 허용
	final int width = 100;
	final int heigth  = 100;
	public void call() {
		System.out.println("전화");
	}
	public void message() {
		System.out.println("문자");
	}
}
