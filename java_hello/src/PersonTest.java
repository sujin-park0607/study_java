class Person{
	String name;
	String passport;
	
	public Person(String name) {
		this.name = name;
	}
	
	public Person(String name, String passport) {
		this(name);
		this.passport = passport;
	}
}


public class PersonTest {

	public static void main(String[] args) {
		Person kim = new Person("�踻��");
		Person hong = new Person("ȫ�浿","0000-0000"); 

	}

}
