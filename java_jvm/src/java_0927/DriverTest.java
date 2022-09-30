package java_0927;

interface Printable{
	public abstract void print(String doc);
}

class SPrinterDriver implements Printable{
	
	@Override
	public void print(String doc) {
		System.out.println("삼성 프린트입니다.");
		System.out.println(doc);
	}
}

class LPrinterDriver implements Printable{
	@Override
	public void print(String doc) {
		System.out.println("LG 프리터 입니다.");
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
		System.out.println("날 수 있습니다");
	}

	@Override
	public void drive() {
		System.out.println("드라이브 가능합니다.");
	}
	
}



public class DriverTest {

	public static void main(String[] args) {
		
//		Printable prn = new SPrinterDriver();
//		prn.print("출력해주세요");
//		
//		prn = new LPrinterDriver();
//		prn.print("출력해주세요");
		
		FlyingCar flyingCar = new FlyingCar();
		flyingCar.drive();
		flyingCar.fly();
	}

}
