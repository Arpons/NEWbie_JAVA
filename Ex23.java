
public class Ex23 {

	public static void main(String[] args) {
		int number = primeFactor(9);
		System.out.println(number);

	}
	public static int primeFactor(int num) {
		int result =  num / 2;;
		while (true) {
			
			if (result % 2 == 1) {
				System.out.println(result);
				return result;
			} else if (result % 2 == 0) {
				System.out.println("2*");
				return primeFactor(result);
			} else if( result / 2 == 1) {
				return result;
			}
			
		}
	}

}
