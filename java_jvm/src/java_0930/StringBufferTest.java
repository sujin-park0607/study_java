package java_0930;

public class StringBufferTest {

	public static void main(String[] args) {
//		String str = new String("1234");
		StringBuilder sb = new StringBuilder("123");
		
		sb.append(4567); //���ڿ� �����̱�
		
		sb.delete(0, 2); //���ڿ� ����
		
		sb.replace(0, 3, "AB"); //���ڿ� �Ϻ� ��ü
		
		sb.reverse(); //���ڿ� ������
		
		String sub = sb.substring(2, 4); //������ŭ ���ش�.
		
		System.out.println(sb);
		System.out.println(sb.toString());

	}

}
