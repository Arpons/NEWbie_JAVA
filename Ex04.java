
public class Ex04 {

	public static void main(String[] args) {
		int[] numbers = { 1, 1, 2, 2, 1, 1, 1, 4, 4, 4, 5, 5, 5, 3, 3, 3, 2, 2, 1, 1, 4, 4 };
		int[] grades = { 1, 2, 3, 4, 5 };
		int[] count = new int[5];
		//int형 배열 생성시 전부 0으로 초기화
		
		// 각 숫자 별 빈도수
		for (int index1 = 0; index1 < numbers.length; index1++) {
			for (int index2 = 0; index2 < grades.length; index2++) {
				if (numbers[index1] == grades[index2]) {
					count[index2] += 1;
					
				}
			}

		}
		for (int i = 0; i < 5; i++) {
			System.out.println(grades[i] + "의 등장 횟수 " + count[i]);
		}

	}

}
