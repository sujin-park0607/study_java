package java_0927;

import java.util.Scanner;

abstract class Calc{
	protected int a;
	protected int b;
	
	public void setValue(int a, int b) {
		this.a = a;
		this.b = b;
	}
	
	public abstract int calculate();
}

class Add extends Calc {

	@Override
	public int calculate() {
		return super.a + super.b;
	}
	
}

class Sub extends Calc {

	@Override
	public int calculate() {
		return super.a - super.b;
	}
	
}

class Mul extends Calc {

	@Override
	public int calculate() {
		return super.a * super.b;
	}
	
}

class Div extends Calc {
	@Override
	public int calculate() {
		return super.a / super.b;
	}
	
}

public class CalcTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("두 정수와 연산자를 입력하시오 >>");
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		char c = sc.next().charAt(0);
		
		Calc cal;
		
		if(c == '+') {
			cal = new Add();
		}
		else if(c=='-') {
			cal = new Sub();
		}
		else if(c == '*') {
			cal = new Mul();
			
		}
		else {
			cal = new Div();
		}
		cal.setValue(a, b);
		System.out.println(cal.calculate());

	}

}
