package java_0930;

public class StringBufferTest {

	public static void main(String[] args) {
//		String str = new String("1234");
		StringBuilder sb = new StringBuilder("123");
		
		sb.append(4567); //문자열 덧붙이기
		
		sb.delete(0, 2); //문자열 삭제
		
		sb.replace(0, 3, "AB"); //문자열 일부 교체
		
		sb.reverse(); //문자열 뒤집기
		
		String sub = sb.substring(2, 4); //범위만큼 빼준다.
		
		System.out.println(sb);
		System.out.println(sb.toString());

	}

}
