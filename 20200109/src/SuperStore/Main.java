package SuperStore;

public class Main {

	public static void main(String[] args) {
		SuperStore s1 = new SuperStore();
		s1.makeIcecream();
		
		Sub1Store s2 = new Sub1Store();
		s2.makeMacarong();
		s2.makeIcecream();
		
		Sub2Store s3 = new Sub2Store();
		s3.makeIcecream();
		s3.coffe();
		
		//upcasting
		SuperStore s4 = new Sub1Store();
		 
		//downcasting
		((Sub1Store)s4).makeMacarong();

	}

}
