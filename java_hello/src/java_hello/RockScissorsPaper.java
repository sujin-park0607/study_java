package java_hello;
import java.util.*;

public class RockScissorsPaper {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("가위(0) 바위(1) 보(2)");
		int user= sc.nextInt();
		
		final int computer= (int)(Math.random() * 3);
		
		System.out.println("인간 : "+ user + " 컴퓨터 : " + computer);
		if(user == computer) {
			System.out.println("무승부입니다!");
		}
		else if(user == 0 && computer == 1 || user == 1 && computer == 2 || user == 2 && computer == 0) {
			System.out.println("컴퓨터 승리");
		}
		else {
			System.out.println("인간 승리");
		}
			
		
		
		
		

	}

}
