class Student{
	String name;
	int number;
	int age;
	
}


public class StudentTest {

	public static void main(String[] args) {
		Student student = new Student();
		student.name = "Kim";
		student.number = 20180001;
		student.age = 20;
		
		System.out.println("�̸�: " + student.name);
		System.out.println("�й�: " + student.number);
		System.out.println("����: " + student.age);

	}

}
