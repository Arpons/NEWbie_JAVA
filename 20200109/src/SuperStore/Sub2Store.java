package SuperStore;

public class Sub2Store extends SuperStore{
	public void coffe() {
		System.out.println("커피를 만든다.");
	}

	@Override
	public void makeIcecream() {
		System.out.println("치즈아이스크림 만든다.");
		
	}


}
