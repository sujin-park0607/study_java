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
		System.out.println("�̸� : "+ name);
		System.out.println("���� : "+ age);
		System.out.println("�ּ� : "+ address);
		System.out.println("�μ� : "+ department);
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
		System.out.println("������");
		System.out.println("���� : " + salary);
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
		System.out.println("��������");
		System.out.println("���ѽð� : " + workHours);
		System.out.println("�޿� : " + workHours * pay);
	}
}


public class EmployeeTest {
	
	public static void main(String[] args) {
		
		Regular r = new Regular("�̼���", 35, "����", "�λ��");
		Temporary t = new Temporary("�庸��", 25, "��õ", "�渮��");
		
		r.setSalary(5000000);
		r.printInfo();
		
		t.setWorkHours(120);
		t.printInfo();

	}

}