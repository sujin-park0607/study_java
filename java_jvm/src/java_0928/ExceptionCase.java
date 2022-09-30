package java_0928;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionCase {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		
		try {
			System.out.println("a/b...a? ");
			int n1 = kb.nextInt();
			
			System.out.println("a/b...b? ");
			int n2 = kb.nextInt();
			
			System.out.printf("%d / %d = %d \n",n1, n2, n1/n2);
			
		} catch(ArithmeticException e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}catch(InputMismatchException e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}finally {
			System.out.println("무조건 실행");
		}
		
		System.out.println("Good bye~~~!");

	}

}
