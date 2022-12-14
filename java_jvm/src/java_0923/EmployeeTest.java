package java_0923;

class Employee {
	private String name;
	private int age;
	private String address;
	private String department;
	
	
	public Employee(String name, int age, String address, String department) {
		this.name = name;
		this.age = age;
		this.address = address;
		this.department = department;
	}
	
	
	public void printInfo() {
		System.out.println("이름 : "+ name);
		System.out.println("나이 : "+ age);
		System.out.println("주소 : "+ address);
		System.out.println("부서 : "+ department);
	}
		
}

class Regular extends Employee {
	private int salary;
	
	
	public Regular(String name, int age, String address, String department) {
		super(name, age, address, department);
		
	}
	
	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	
	@Override
	public void printInfo() {
		super.printInfo();
		System.out.println("정규직");
		System.out.println("월급 : " + salary);
	}
}

class Temporary extends Employee {
	private int workHours;
	private int pay = 100000;
	
	
	public Temporary(String name, int age, String address, String department) {
		super(name, age, address, department);
	}
	
	public void setWorkHours(int workHours) {
		this.workHours = workHours;
	}
	
	@Override
	public void printInfo() {
		super.printInfo();
		System.out.println("비정규직");
		System.out.println("일한시간 : " + workHours);
		System.out.println("급여 : " + workHours * pay);
	}
}


public class EmployeeTest {
	
	public static void main(String[] args) {
		
		Regular r = new Regular("이순신", 35, "서울", "인사부");
		Temporary t = new Temporary("장보고", 25, "인천", "경리부");
		
		r.setSalary(5000000);
		r.printInfo();
		
		t.setWorkHours(120);
		t.printInfo();

	}

}
