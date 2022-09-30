package java_0923;

abstract class Shape{
	protected int width;
	protected int height;

	public Shape() {	
	}
	
	public Shape(int width, int height) {
		this.width = width;
		this.height = height;
	}
	

	public void draw() {
		System.out.println("도형입니다. ");
	}
	
	public abstract double getArea();
}

class Rectangle extends Shape{
	public Rectangle() {
	}
	
	public Rectangle(int width, int height) {
		super(width, height);
	}
	
	@Override
	public double getArea() {
		return this.width * this.height;
	}
}


class Triangle extends Shape{
	public Triangle(){
	}
	
	public Triangle(int width, int height) {
		super(width, height);
	}
	
	@Override
	public double getArea() {
		return (super.width * super.height)/2.0;
	}
}


class Circle extends Shape{
	private double radius;

	public Circle() {
	}
	
	public Circle(double radius) {
		this.radius = radius;
	}
	
	@Override
	public double getArea() {
		return Math.PI * this.radius * this.radius;
	}
}


public class OverTest {
	
	static public void print(Shape shape) {
		if (shape instanceof Rectangle) {
			System.out.println("실제 타입은 Rectangle 입니다"); //캐스팅 가능 여부를 물음
			Rectangle rec = (Rectangle) shape;
		}else if(shape instanceof Circle) {
			System.out.println("실제 타입은 Circle 입니다");
		}else {
			System.out.println("알수 없는 타입입니다.");
		}
		
	}

	public static void main(String[] args) {
		
		Shape[] shape = {new Triangle(10,10), new Rectangle(10,10), new Circle(10)};
		
		 print(shape[2]);
		
//		shapeArea(shape[0]);
//		shapeArea(shape[1]);
//		shapeArea(shape[2]);
//		
//		double sumArea = 0;
//		
//		for(Shape s : shape) {
//			sumArea += s.getArea();
//		}
//		System.out.println(sumArea);
	}
}
