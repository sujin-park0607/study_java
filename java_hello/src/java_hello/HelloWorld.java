package java_hello;

import java.util.Random;
import java.util.Arrays;

public class HelloWorld {

	public static void main(String[] args) {
		
		Random ran = new Random();
		
		int[] arr = new int[6];
		int randomNum;
		
		for(int i=0; i<arr.length; i++) {
			randomNum = ran.nextInt(46) + 1;
			for (int j : arr) {
				if(j == randomNum) {
					continue;
				}
				else {
					arr[i] = randomNum;
				}
			}	
		}
		System.out.println(Arrays.toString(arr));
	}
}
