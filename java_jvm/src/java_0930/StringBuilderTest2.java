package java_0930;

import java.util.Scanner;

public class StringBuilderTest2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("���ڿ��� �Է��ϼ���. ��ĭ�� �־ �ǰ� ���� �ѱ� ��� �Է� ����");
		String str = sc.nextLine();
		
		for(int i=1; i<= str.length(); i++) {
			System.out.print(str.substring(i));
			System.out.println(str.substring(0,i));
		}

	}

}
