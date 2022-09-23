class Rectangle{
	int width;
	int height;
	
	public void setWidth(int width) {
		this.width = width;
	}
	
	public void setHeight(int height) {
		this.height = height;
	}
	
	public int getArea(){
		return width * height;	
	}
}

public class RectangeTest {

	public static void main(String[] args) {
		Rectangle rec = new Rectangle();
		
		rec.setWidth(10);
		rec.setHeight(10);
		
		System.out.println(rec.getArea());

	}

}
