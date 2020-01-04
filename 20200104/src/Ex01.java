import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		String[][] seat = new String[10][10];
		String password;
		int rsrvt = 0;
		boolean check = true;
		String name;
		Scanner scan = new Scanner(System.in);

		while (true) {
			System.out.println("=======공연예약 프로그램=======");
			System.out.println("[1]예약 [2]예약취소 [3]예약확인 [4]종료");
			rsrvt = scan.nextInt();
			if (rsrvt == 1) {
				for (int seatNum = 0; seatNum < 10; seatNum++) {
					if (seat[0][seatNum] == null) {
						System.out.print("-" + (seatNum + 1) + "-\t");
					} else {
						System.out.print(seat[0][seatNum]);
					}
				}
				System.out.println("");

				System.out.println("이름 입력 : ");
				name = scan.next();
				System.out.println("예약할 죄석 선택 : ");
				rsrvt = scan.nextInt();
				System.out.println("비밀번호 입력 :");
				password = scan.next();

				if (seat[0][rsrvt - 1] == null) {
					seat[0][rsrvt - 1] = name;
					seat[1][rsrvt - 1] = password;
					for (int seatNum = 0; seatNum < 10; seatNum++) {
						if (seat[0][seatNum] == null) {
							System.out.print("-" + (seatNum + 1) + "-\t");
						} else {
							System.out.print(seat[0][seatNum] + "\t");
						}
					}

					// continue;

				} else {

					System.out.println("이미 예약자가 있습니다.");
				}

			} else if (rsrvt == 2) {
				System.out.println("취소할 예약자 이름을 입력하세요 : ");
				name = scan.next();
				System.out.println("비밀번호를 입력 해주세요 : ");
				password = scan.next();
				for (int seatNum = 0; seatNum < seat[0].length; seatNum++) {

					if (seat[0][seatNum] != null) {

						
						
						if (seat[0][seatNum] == name && seat[1][seatNum] == password) {
							System.out.println(name + "예약취소 완료되었습니다.");
							seat[0][seatNum] = null;
							

						} else if (check) {
							System.out.println("해당하는 이름이 존재하지 않습니다.");
							check = false;

						}
					}
				}

			} else if (rsrvt == 3) {

				for (int seatNum = 0; seatNum < seat[0].length; seatNum++) {
					if (seat[0][seatNum] == null) {
						System.out.print("-" + (seatNum + 1) + "-\t");
					} else {
						System.out.print(seat[0][seatNum] + "\t");
					}
				}
			} else {
				System.out.println("=======프로그램 종료=======");
				break;
			}
		}

	}
	/*
	 * public static int password (int number1, int number2) { return }
	 */

}
