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
	
			System.out.print("정답을 추측하여 보시오: ");
			input = sc.nextInt();
			
			if(input > number) {
				System.out.println("Down");
			}
			else if(input < number) {
				System.out.println("Up");
			}
			else {
				System.out.println("축하합니다. 시도횟수=" + cnt );
				break;
			}
		}
		if(cnt == 10) {
			System.out.println("10번을 시도하셨습니다. 다음기회에...");
		}
	}
}
