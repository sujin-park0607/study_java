package java_hello;

import java.util.Scanner;

import java.util.Scanner;

public class Star {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("���ڸ� �Է��Ͻÿ�: ");
		int num = sc.nextInt();
		int odd = 1;
		
		for (int i=1; i <= num; i++) {
					
			for (int j=num-i; j >= 0; j--) {
				System.out.print(" ");
			}
			
			for (int k=1; k <= odd; k++) {
				System.out.print("*");
			}
			
			odd += 2;
			System.out.println();
		}

	}

}