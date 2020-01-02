
public class Ex02 {

	public static void main(String[] args) {
		// 래퍼런스 배열
		int[] num1 = {10,20,30,40,50};
		int[] num2 = {110,120,130,140,150};
		System.out.println(num1);
		System.out.println(num2);
		num1 = num2;
		System.out.println(num1);
		num2[2] = 0;
		System.out.println(num1[2]);
		// 기본형
		int a = 5;
		int b = 10;

		a = b;
		System.out.println(a);
		b = 1000;
		System.out.println(a);
	}

}
