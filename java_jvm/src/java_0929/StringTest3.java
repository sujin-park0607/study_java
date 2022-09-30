package java_0929;

import java.util.Scanner;

public class StringTest3 {

	public static void main(String[] args) {
		while(true) {
			System.out.print("문장을 입력하세요 >>");
			
			Scanner sc = new Scanner(System.in);
			String[] str = sc.nextLine().split(" ");
			
			if(str[0].equals("그만")) {
				System.out.println("종료합니다...");
				break;
			}else {
				System.out.println("어절 개수는 "+ str.length);
			}
		}

	}
}
