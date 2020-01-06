package Ex02;

public class employees {
	private String name;
	private String position;
	private int salary;
	private boolean ox;
	
	public employees(String name, String position, int salary, boolean ox) {
		this.name = name;
		this.position = position;
		this.salary = salary;
		this.ox = ox;
	}
	
	public String getName() {
		return name;
	}
	public String getPosition() {
		return position;
	}
	public int getSalary() {
		return salary;
	}
	public boolean getOx() {
		return ox;
	}
	public employees getEmployees(employees name) {
		return name;
	}
}

