//package java_0923;
//
//class Employee {
//	private int salary;
//
//	public Employee() {
//		salary = 3000000; // �⺻��
//	}
//
//	public int getSalary() {
//		return salary;
//	}
//
//	public void setSalary(int salary) {
//		this.salary = salary;
//	}
//}
//
//class Manager extends Employee {
//	public Manager() {
//		super.setSalary(super.getSalary() + 2000000);
//	}
//
//	@Override
//	public int getSalary() {
//		return super.getSalary();
//
//	}
//}
//
//class Programer extends Employee {
//	public Programer() {
//		super.setSalary(super.getSalary() + 3000000);
//	}
//
//	@Override
//	public int getSalary() {
//		return super.getSalary();
//	}
//}
//
//public class Example {
//
//	public static void main(String[] args) {
//
//		Manager manager = new Manager();
//		System.out.println("������ ����: " + manager.getSalary());
//
//		Programer programer = new Programer();
//		System.out.println("���α׷����� ����: " + programer.getSalary());
//
//	}
//}
