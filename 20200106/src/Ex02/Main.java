package Ex02;

public class Main {

	public static void main(String[] args) {
		// 사원(3명) 생성~
		//이름 연봉 직위 점심신청여부
		//1.이기성, 사원, 2800, true;
		//2.이명호, 사원, 3400. false;
		//3.이은비 , 책임, 7000, false;

		employees one = new employees("이기성", "사원", 2800, true);
		employees two = new employees("이명호", "사원", 3400, false);
		employees three = new employees("이은비", "책임", 70000, false);
		
		
		System.out.println(one.getName() +" " +one.getPosition() +" " +one.getSalary() + " "+one.getOx());
		System.out.println(one.getEmployees(one));
	}
	
	
	

}
