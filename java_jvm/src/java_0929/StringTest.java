package java_0929;

public class StringTest {

	public static void main(String[] args) {
		
		//1. ���ͷ��� �����ؼ� ����ϴ� ���
		String s1 = "java";
		String s2 = "java";
		
		//2.��ü�� �����ϴ� ���
		String s3 = new String("java");
		String s4 = new String("java");
		
		if(s1 == s2) {
			System.out.println("�����ϴ�");
		}else {
			System.out.println("�ٸ��ϴ�.");
		}
		
		if(s3 == s4) {
			System.out.println("�����ϴ�");
		}else {
			System.out.println("�ٸ��ϴ�.");
		}
	}

}
