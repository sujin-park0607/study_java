class Circle {
	int radius;
	String cololr;
	
	double calcArea(int radius) {
		return 3.14 * radius * radius;
	}
}


public class CircleTest {

	public static void main(String[] args) {
		
		double area = circleArear(10);
		System.out.println("원의 면적 = " + area);

	}
	
	public static double circleArear(int radius) {
		final double PI = 3.14;
		return radius * radius * PI;
	}

}
