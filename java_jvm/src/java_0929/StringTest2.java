package java_0929;

import java.util.Scanner;

public class StringTest2 {
	public static int stringCount(String[] strArr) {
		int count = 0;
		for (String string : strArr) {
			count += string.length();
		}
		return count;
	}

	public static void main(String[] args) {
		
//		String[] strArr = {"akbce","º½","°¡À»"};
//		
//		int total = stringCount(strArr);
//		System.out.println(total);
		
		//trim
//		String trimStr = " I Love you ";
//		
//		System.out.println(trimStr.length());
//		System.out.println(trimStr.trim().length());
//	
//		//split
//		String[] tokens = "I am a boy".split(" ");
//		for (String token : tokens) {
//			System.out.println(token);
//		}
		
		//valueOf
		
		int num =  100;
		
		String str2 = String.valueOf(num);
		System.out.println(str2);
	}

}
