package java_0929;

class Student{
	 private String name;
	 private String gender;
	
	Student(String name, String gender){
		this.name = name;
		this.gender = gender;
	}
	
	@Override
	public String toString() {
		return "�̸��� "+name+"�̰� ������ "+ gender+"�Դϴ�.";
		
	}
}

public class StudentToStringTest {

	public static void main(String[] args) {
		
		Student s = new Student("ȫ�浿","����");
		System.out.println(s);
				

	}

}
