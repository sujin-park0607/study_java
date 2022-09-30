package java_0927;

interface Printable{
	public abstract void print(String doc);
}

class SPrinterDriver implements Printable{
	
	@Override
	public void print(String doc) {
		System.out.println("�Ｚ ����Ʈ�Դϴ�.");
		System.out.println(doc);
	}
}

class LPrinterDriver implements Printable{
	@Override
	public void print(String doc) {
		System.out.println("LG ������ �Դϴ�.");
		System.out.println(doc);
	}
}

interface Drivable{
	void drive();
}

interface Flyable{
	void fly();
}

class FlyingCar implements Drivable, Flyable{

	@Override
	public void fly() {
		System.out.println("�� �� �ֽ��ϴ�");
	}

	@Override
	public void drive() {
		System.out.println("����̺� �����մϴ�.");
	}
	
}



public class DriverTest {

	public static void main(String[] args) {
		
//		Printable prn = new SPrinterDriver();
//		prn.print("������ּ���");
//		
//		prn = new LPrinterDriver();
//		prn.print("������ּ���");
		
		FlyingCar flyingCar = new FlyingCar();
		flyingCar.drive();
		flyingCar.fly();
	}

}
