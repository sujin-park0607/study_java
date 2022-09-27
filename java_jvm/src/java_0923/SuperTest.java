package java_0923;

//super 키워드
//this 키워드
class A{
	protected int a = 10;
	
	public A() {
	}
	
	public A(int a, int b) {
		System.out.println(a + b);
	}
	
	public int getA() {
		return a;
	}
}

class B extends A{
	public B() {
		super(10, 20); //부모생성자
		System.out.println(getA());
		System.out.println(super.getA());
		System.out.println(this.getA());
	}
}

public class SuperTest {

	public static void main(String[] args) {
		B b = new B();

	}

}
