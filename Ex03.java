import java.util.Scanner;

public class Ex03 {
	public static void main(String[] args) {
		// ���� ����
		// ���� �ΰ��� �Է� �޾� �� ���� ���� �غ���
		Scanner scan = new Scanner(System.in);
		// ������ �ʱ�ȭ 
		int num1 = 0;  // �Է� ���� ù ��° ��
		int num2 = 0;  // �Է� ���� �� ��°��
		int result = 0;  // ����� ����� ����
		
		System.out.println("[���� ����]");
		System.out.print("ù ��° ���ڸ� �Է��ϼ��� : ");
		num1 = scan.nextInt();
		System.out.print("�� ��° ���ڸ� �Է��ϼ��� : ");
		num2 = scan.nextInt();
		
		result = num1 * num2;
		//����� ����� ������ ���ش�.
		
		System.out.println("����� " + result + " �Դϴ�.");
	}

}
