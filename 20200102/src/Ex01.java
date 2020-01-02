
public class Ex01 {

	public static void main(String[] args) {
		// 배열 (array)
		// 1.비어있는(null) 배열 6칸 생성
		String[] names = new String[6];
		System.out.println(names);
		names[0] = "김소연";
		names[1] = "류인철";
		names[2] = "이다빈";
		names[3] = "박원우";
		names[4] = "지범수";
		names[5] = "박승현";
		/*
		 * 배열의 한계점 1.이미 할당된 배열의 길이는 조절 할 수 없음. -> ArrayList 2.동일한 자료형만을 저장 할 수 있음. ->
		 * OOP
		 */

		// 2. 데이터를 저장하면서 생성
		String[] names2 = { "김소연", "류인철", "이다빈", "박원우", "지범수", "박승현" };
		System.out.println(names2);
		for (int index = 0; index < names.length; index++) {
			if (names[index].equals("이기성")) {
				System.out.println((index + 1) + "번째 동명이인 입니다.");
			}
		}
		// for-each문(확장 for 문)
		// 배열 사용시 활용 할 수 있는 for문
		
		for(String temp : names) {
			if (temp.contentEquals("이기성")) {
				System.out.println("동명이인이 있습니다.");
			}
		}
	}

}
