package java_hello;
import java.util.*;

public class RockScissorsPaper {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("����(0) ����(1) ��(2)");
		int user= sc.nextInt();
		
		final int computer= (int)(Math.random() * 3);
		
		System.out.println("�ΰ� : "+ user + " ��ǻ�� : " + computer);
		if(user == computer) {
			System.out.println("���º��Դϴ�!");
		}
		else if(user == 0 && computer == 1 || user == 1 && computer == 2 || user == 2 && computer == 0) {
			System.out.println("��ǻ�� �¸�");
		}
		else {
			System.out.println("�ΰ� �¸�");
		}
			
		
		
		
		

	}

}
