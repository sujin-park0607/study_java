package java_0927;

//�ڼ��� �����϶�
abstract class Animal{	
	public abstract void move();
}

class Lion extends Animal{
	
	@Override
	public void move() {
		System.out.println("������ move �޼ҵ� �Դϴ�.");
	}
}

public class HelloWorld {
	
	public static void main(String[] args) {
		Lion lion = new Lion();
		lion.move();
		
	}

}
