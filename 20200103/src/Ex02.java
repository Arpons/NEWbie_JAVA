
public class Ex02 {

	public static void main(String[] args) {
		String str = "A,A,C,D,C,C,B,B";
		String[] str_split = str.split(",");
		//split Method : 매게변슈로 전달 받은 문자를 기준으로 데이터를 잘라서 String배열로 리턴
		System.out.println(str);
		//
		int number = closer10(20, 65);
		System.out.println("더 가까운 수 는 " +number);
		int num = closer7(9,13);
		System.out.println("7 : " + num);
	}
	public static int closer10(int a,int b) {
		int num1 = (a - 10)*(a - 10);
		int num2 = (b - 10)*(b - 10);
		if (num1 < num2) {
			return a;
		} else if(num1 > num2){
			return b;
		}
		return -1;
	}
	
	public static int closer7(int i, int j) {
		if(Math.abs(7 - i) > Math.abs(7 - j)) {
			return j;
		} else if(Math.abs(7 - i ) < Math.abs(7 - j)) {
			return i;
		}
		return -1;
	}
}
