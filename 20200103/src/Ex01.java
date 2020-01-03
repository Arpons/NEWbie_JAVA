
public class Ex01 {

	public static void main(String[] args) {
		// 학생 한명의 국, 영, 수 점수 저장
		// 90,98,10
		int[] score1 = { 90, 98, 10 };
		int[] score2 = { 98, 3, 97 };
		int[] score3 = { 10, 87, 1 };
		int[] score4 = { 10, 12, 100 };
		int[] score5 = { 98, 97, 100 };

		int[][] total = { score1, score2, score3, score4, score5 };
		int[][] all = new int[5][3];
		int sum = 0;
		int avg = 0;
		int sumSubject = 0;
		int avgSubject = 0;

		//// 점수 및 학생 점수 평균////////////////////////////////////
		for (int address = 0; address < total.length; address++) {
			for (int score = 0; score < total[address].length; score++) {
				System.out.print(total[address][score] + " ");
				sum += total[address][score];
				

			}
			avg = sum / (total[address].length);
			System.out.println("평균 " + avg);
			String grade = getGrade(avg);
			System.out.println("평균 점수의 등급은 " + grade);    
			sum = 0;
			System.out.println();

		}
		// 과목 평균 점수
		for (int addressScore = 0; addressScore < total[0].length; addressScore++) {
			for (int index = 0; index < total.length; index++) {
				sumSubject += total[index][addressScore];

			}
			avgSubject = sumSubject / total.length;
			
			System.out.println("과목 평균 " + avgSubject);
			String grade = getGrade(avgSubject);
			System.out.println("과목별 평균 점수의 등급은 " + grade);    
			sumSubject = 0;

		}
		                                                                                                                                                                                                                                                                      

		
	}

	
	public static String getGrade(int score) {
		String result; 
		if (score >= 90) {
			result = "A";
		} else if(score >= 80) {
			result = "B";
		} else if(score >= 70) {
			result = "C";
		} else {
			result = "F";
		}
		return result;
	}
}
