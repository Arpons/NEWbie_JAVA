package SuperStore;
//추상 메서드가 하나라도 있다면 추상클래그가 됨
public abstract class SuperStore {
	//추상 메서드
	public abstract void makeIcecream();
	public final void makeCookie() {
		System.out.println("쿠키를 만든다.");
	}

}
