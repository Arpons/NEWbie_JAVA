
public class Ex12 {

	public static void main(String[] args) {
		String score = "A,A,B,C,D,A,C,D,D,D,F";
		String[] word = score.split(",");
		String[] check = {"A","B","C","D","F"};
		int[] person = new int[check.length];
		
		for (int wordIndex = 0; wordIndex < word.length; wordIndex++) {
			for(int checkIndex = 0; checkIndex < check.length; checkIndex++) {
				if (check[checkIndex] == word[wordIndex]) {
					person[checkIndex] += 1;
				}
			}
		}for (int repeat = 0; repeat < check.length; repeat++) {
			System.out.println(check[repeat] +": " + person[repeat] + "명");
		}
 		
	}
}
