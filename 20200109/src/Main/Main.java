package Main;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Controller con = new Controller();
		while (true) {
			switch (con.add()) {
			case 1:
				con.inputOne();
				break;
			case 2:
				con.inputTwo();
				break;
			case 3:
				con.inputThree();
				break;
			}

		}
	}

}
