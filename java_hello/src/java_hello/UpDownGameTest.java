package java_hello;

import java.util.Scanner;
import java.util.Random;
class UpDownGame{
	
}

public class UpDownGameTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random ran = new Random();
		
		int input;
		int cnt = 0;
		int number = ran.nextInt(100);
		
		for(int i=0; i<10; i++) {
			cnt ++;
	
			System.out.print("������ �����Ͽ� ���ÿ�: ");
			input = sc.nextInt();
			
			if(input > number) {
				System.out.println("Down");
			}
			else if(input < number) {
				System.out.println("Up");
			}
			else {
				System.out.println("�����մϴ�. �õ�Ƚ��=" + cnt );
				break;
			}
		}
		if(cnt == 10) {
			System.out.println("10���� �õ��ϼ̽��ϴ�. ������ȸ��...");
		}
	}
}
