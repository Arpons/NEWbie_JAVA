import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
		// ��ġ���� ����
		// �ݾװ� �ο����� �Է� �޾� �� ���� �����ϴ� �ݾ��� ���!(�Ҽ�������!)
		
		Scanner scan = new Scanner(System.in);
		int money = 0;
		int cnt = 0;
		double result = 0;
		System.out.print("�ݾ��� �Է� ���ּ��� : ");
		money = scan.nextInt();
		System.out.print("�ο��� �Է� ���ּ��� : ");
		cnt = scan.nextInt();
		result = ((double)money / cnt);
		result = ((int)(result * 100)/100.0);
		
		System.out.println("1 �δ� " + result + " �Դϴ�.");

	}

}
