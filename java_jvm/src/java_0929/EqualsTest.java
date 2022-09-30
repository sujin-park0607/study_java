package java_0929;


class Circle2 {
	private int radius;
	
	Circle2(int radius){
		this.radius = radius;
	}
	
	public int getRadius() {
		return radius;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Circle2) {
			Circle2 c1 = (Circle2) obj;
			
			if(this.radius == c1.getRadius()){
				return true;
			}
		}
		return false;
	}
}


public class EqualsTest {
	public static void main(String[] args) {
		Circle2 circle1 = new Circle2(10);
		Circle2 circle2 = new Circle2(10);
		
		if(circle1 == circle2)
			System.out.println("2개의 원은 같습니다");
		else
			System.out.println("2개의 원은 다릅니다.");
		
		
		
		if(circle1.equals(circle2))
			System.out.println("2개의 원은 같습니다");
		else
			System.out.println("2개의 원은 다릅니다.");
	} 

}
