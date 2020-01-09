package Game;

import java.util.Random;
import java.util.Scanner;

public class Controller {
	
	private PlusGame cd;
	
	public Controller(PlusGame cd) {
		this.cd = cd;
	}
	
	public void start() {
		
		Scanner scan = new Scanner(System.in);
		
		
		int answer;
		int numFirst;
		int numSecond;
		int count = 0;
		
		for (int i = 0; i < cd.getLife();) {
			cd.makeRandom();
			
			System.out.println(cd.getQue());
			System.out.println("정답 입력 : ");
			answer = scan.nextInt();

			if (cd.isOK(answer)) {
				System.out.println(cd.getGoodMessage());
			} else {
				System.out.println(cd.getWord()[i++]);
			}
		}
	}

}
