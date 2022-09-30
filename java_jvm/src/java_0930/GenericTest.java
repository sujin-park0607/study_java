//package java_0930;
//
//class Apple{
//	
//	@Override
//	public String toString(){
//		return "나는 사과입니다.";
//	}
//}
//
//class Orange{
//	
//	@Override
//	public String toString(){
//		return "나는 오렌지 입니다.";
//	}
//}
//
//
//class Box{
//	
//	private Object obj;
//	
//	public void set(Object obj) {
//		this.obj = obj;
//	}
//	
//	public Object get() {
//		return obj;
//	}
//}
//public class GenericTest {
//	public static void main(String[] args) {
//		
//		Box aBox = new Box();
//		Box oBox = new Box();
//		
////		aBox.set(new Apple());
////		oBox.set(new Orange());
//		aBox.set("Apple");
//		oBox.set("Orange");
//		
////		Apple ap = (Apple) aBox.get(); //형변환 과정이 반드시 필요
////		Orange og = (Orange) oBox.get();
//		
//		System.out.println(aBox.get());
//		System.out.println(oBox.get());
//	}
//
//}
