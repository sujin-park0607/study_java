//package java_0930;
//
//class Apple {
//
//	@Override
//	public String toString() {
//		return "나는 사과입니다.";
//	}
//}
//
//class Orange {
//
//	@Override
//	public String toString() {
//		return "나는 오렌지 입니다.";
//	}
//}
//
//class Box<T> {
//	private T ob;
//
//	public void set(T o) {
//		this.ob = o;
//	}
//
//	public T get() {
//		return ob;
//	}
//}
//
//class DBox<T1, T2>{
//	private T1 str;
//	private T2 num;
//	
//	public void set(T1 str, T2 num) {
//		this.str = str;
//		this.num = num;
//	}
//	
//	@Override
//	public String toString() {
//		return str + " & " + num;
//	}
//}
//
//public class GenericTest2 {
//	public static void main(String[] args) {
//		
////		Box<Apple> aBox = new Box<Apple>();
////		Box<Orange> oBox = new Box<Orange>();
//		
//		DBox<String, Integer> box = new DBox<String,Integer>();
//		
//		box.set("Apple",25);
//		
//		System.out.println(box);
//		
//		
////		aBox.set(new Apple());
////		oBox.set(new Orange());
////		
////		Apple ap = aBox.get();
////		Orange op = oBox.get();
////
////		System.out.println(ap);
////		System.out.println(op);
//
//	}
//
//}
