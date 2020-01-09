package Mouse;

public class Main {

	public static void main(String[] args) {
		// 슈퍼 마우스
		// 슈퍼 클래스 동시에 두가지를가질 수 없음
		// 상속의 단계, 횟수 제한 X
		SuperMouse mouse1 = new SuperMouse();
		mouse1.click();
		mouse1.drag();
		mouse1.leftClick();
		
		WheelMouse mouse2 = new WheelMouse();
		mouse2.Wheel();
		mouse2.click();
		mouse2.leftClick();
		mouse2.drag();
		GameingMouse mouse3 = new GameingMouse();
		mouse3.WkiyMouse();
		mouse3.click();
		mouse3.drag();
	}

}
