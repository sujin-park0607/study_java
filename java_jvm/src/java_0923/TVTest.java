package java_0923;

class TV {
	private int size;

	public TV(int size) {
		this.size = size;
	}

	protected int getSize() {
		return size;
	}
}

class ColorTV extends TV {
	private int color;

	public ColorTV(int size, int color) {
		super(size);
		this.color = color;

	}
	
	protected int getColor() {
		return color;
	}

	public void printProperty() {
		System.out.println(super.getSize() + "인치 " + color + "컬러");
	}
}

class IPTV extends ColorTV{
	private String ip;
	
	public IPTV(String ip, int size, int color) {
		super(size, color);
		this.ip = ip;
	}
	
	public void printProperty() {
		System.out.println("나의 IPTV는 " + ip + "주소의" + super.getSize()+ "인치 " + super.getColor()+"컬러");
	}
}

public class TVTest {

	public static void main(String[] args) {
		IPTV iptv = new IPTV("192.1.1.2",32, 2048);
		iptv.printProperty();

	}

}
