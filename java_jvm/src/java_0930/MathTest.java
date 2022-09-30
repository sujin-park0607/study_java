package java_0930;

public class MathTest {

	public static void main(String[] args) {
		
		double radian45 = Math.toRadians(45);
		
		System.out.println("sin45" + Math.asin(radian45));
		System.out.println("cos45" + Math.cos(radian45));
		System.out.println("tan45" + Math.tan(radian45));
	
		System.out.println("2ÀÇ 16½Â" + Math.pow(2, 16));
		System.out.println("·Î±× 25" + Math.log(25));
		
		int num = (int)(Math.random() * 100) + 1;
		
		System.out.println(Math.PI);
	}

}
