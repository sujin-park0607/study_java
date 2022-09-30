package java_0927;

//자손이 구현하라
abstract class Animal{	
	public abstract void move();
}

class Lion extends Animal{
	
	@Override
	public void move() {
		System.out.println("사자의 move 메소드 입니다.");
	}
}

public class HelloWorld {
	
	public static void main(String[] args) {
		Lion lion = new Lion();
		lion.move();
		
	}

}
