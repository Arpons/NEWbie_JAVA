package ee;

import java.util.Scanner;

public class Ex12 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String id = "id";
		String password = "password";
		String input_id, input_pass;
		
		System.out.println("ID를 입력하세요 :");
		input_id = scan.next();
		System.out.println("Password를 입력하세요 : ");
		input_pass = scan.next();
		
		if (id.equals(input_id) && password.equals(input_pass)) {
			System.out.println("Log in");
		} else {
			System.out.println("Fails");
		}

	}

}
