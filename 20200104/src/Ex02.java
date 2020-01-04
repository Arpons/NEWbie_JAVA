
public class Ex02 {

	public static void main(String[] args) {
		boolean a = isDivisor(6, 8);
		System.out.println(a);
		boolean b = isPerfect(28);
		System.out.println(b);
		boolean c = isPrime(5);
		System.out.println(c);
		int count = 0
				;
		for (int num = 1; num <= 1000; num++) {
			if (isPerfect(num)) {
				count +=1;
			}
		}
		System.out.println(count);

		
		
		
		
		
		

		
	}
	public static boolean isDivisor(int num1, int num2) {
		return num1 % num2 == 0;
	}
	public static boolean isPerfect(int num) {
		int sum = 0;
		for (int number = 1; number < num; number++) {
			if (num % number == 0) {
				sum += number;
			}
		}
		return (sum == num);
		
				
	}
	public static boolean isPrime(int num) {
		int count = 0;
		for (int number = 1; number < num; number++) {
			if(num % number == 0) {
				count += 1;
			}
		}
		return (count < 3);
	}
	

}
