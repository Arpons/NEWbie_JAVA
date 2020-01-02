
public class Ex01 {

	public static void main(String[] args) {
		int num = 5;
		int[] array = { 6, 7, 8 };
		double[] numbers = {11.14, 12.2, 13.154};
		int[] groups = {3, 4, 7, 8, 9, 20, 22, 66, 28, 71};
		int[] results = {};
		
		for (int index = 0; index < groups.length; index++) {
			if (groups[index] % 2 == 0) {
				
				System.out.print(groups[index] + " ");
				
			}
		}
		
	}

	
}
