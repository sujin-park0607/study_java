package java_0930;

public class WrapperClassTest {

	public static void main(String[] args) {
		
		//n1 과 n2는 객체이며 래퍼클래스이다
		//private final int value;\
		
		Integer n1 = Integer.valueOf(5);
		Integer n2 = Integer.valueOf("1234");
		
		int num = n1;
		System.out.println(num); //언박싱
		
		Integer n3 = 5;
		System.out.println(n3); //박싱
		
		
		
		System.out.println(num);

	}

}
