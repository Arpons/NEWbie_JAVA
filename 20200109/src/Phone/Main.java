package Phone;

public class Main {

	public static void main(String[] args) {
		// 전화, 문자
		//wifi(); 카톡;
		// 생과일 타이쿤
		Phone phone = new Phone();
		SmartPhone smartPhone = new SmartPhone();
		FeaturePhone featurePhone = new FeaturePhone();
		Apple apple = new Apple();
		Galexy galexy = new Galexy();
		
		/// upcasting
		Phone phone1 = new SmartPhone();
		phone.call();
		phone.message();
		//
		smartPhone.kakaotalk();
		smartPhone.wifi();
		//
		featurePhone.game();
		//
		apple.appStore();
		//
		galexy.lutin();
		galexy.pay();
		
		fix(new SmartPhone());
		
	}
	public static void fix(SmartPhone s) {
		
	}

}
