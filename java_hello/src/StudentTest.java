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
		
		System.out.println("이름: " + student.name);
		System.out.println("학번: " + student.number);
		System.out.println("나이: " + student.age);

	}

}
