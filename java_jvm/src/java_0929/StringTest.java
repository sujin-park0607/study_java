package java_0929;

public class StringTest {

	public static void main(String[] args) {
		
		//1. 리터럴을 정의해서 사용하는 방법
		String s1 = "java";
		String s2 = "java";
		
		//2.객체를 생성하는 방법
		String s3 = new String("java");
		String s4 = new String("java");
		
		if(s1 == s2) {
			System.out.println("같습니다");
		}else {
			System.out.println("다릅니다.");
		}
		
		if(s3 == s4) {
			System.out.println("같습니다");
		}else {
			System.out.println("다릅니다.");
		}
	}

}
