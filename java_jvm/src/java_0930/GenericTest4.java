package java_0930;

class Box<T extends Number>{
	private T obj;
	
	public void set(T obj) {
		this.obj = obj;
	}
	
	public T get() {
		return obj;
	}
}

public class GenericTest4 {

	public static void main(String[] args) {
		Box<Integer> iBox = new Box<>();
		iBox.set(24);
		System.out.println(iBox.get());

	}

}
