package java_0929;

import java.util.Scanner;

public class StringTest3 {

	public static void main(String[] args) {
		while(true) {
			System.out.print("������ �Է��ϼ��� >>");
			
			Scanner sc = new Scanner(System.in);
			String[] str = sc.nextLine().split(" ");
			
			if(str[0].equals("�׸�")) {
				System.out.println("�����մϴ�...");
				break;
			}else {
				System.out.println("���� ������ "+ str.length);
			}
		}

	}
}
