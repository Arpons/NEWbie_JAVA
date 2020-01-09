package Auto;

import java.util.Random;

public class Main {

	public static void main(String[] args) {
		// 잠만보, 푸린, 슬리프,
		// 클래스
		/*
		 * Jam[] doll1 = {new Jam(), new Jam(), new Jam()}; Purin[] doll2 = {new
		 * Purin(), new Purin()};
		 */
		/*
		 * Doll[] jam = { new Jam(), new Jam(), new Jam() }; Doll[] purin = { new
		 * Purin(), new Purin() }; Doll[] sleep = { new Sleep(), new Sleep() };
		 */
		Doll[] doll = { new Jam(), new Purin(), new Sleep() };
		String[] arr = { "Jam", "Purin", "Sleep" };
		Machine(doll);

	}

	// 메소드 오버로딩(중복정의) : 매개변수 타입이 다른경우 및 개수가 다르면, 메서드의 이름이 같을 수 있다.
	public static void Machine(Doll[] doll) {
		int choice = new Random().nextInt(doll.length);
		
		doll[choice].pick();
		// downcastiong
		//
//		if (doll[choise] instanceof Jam) {
//			((Jam) doll[choise]).pick();
//		} else if (doll[choise] instanceof Purin) {
//			((Purin) doll[choise]).pick();
//		} else if (doll[choise] instanceof Sleep) {
//			((Sleep) doll[choise]).pick();
//		}

	}

}
