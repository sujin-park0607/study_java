package java_0930;

public class WrapperClassTest {

	public static void main(String[] args) {
		
		//n1 �� n2�� ��ü�̸� ����Ŭ�����̴�
		//private final int value;\
		
		Integer n1 = Integer.valueOf(5);
		Integer n2 = Integer.valueOf("1234");
		
		int num = n1;
		System.out.println(num); //��ڽ�
		
		Integer n3 = 5;
		System.out.println(n3); //�ڽ�
		
		
		
		System.out.println(num);

	}

}
