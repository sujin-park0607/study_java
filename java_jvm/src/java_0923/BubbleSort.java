package java_0923;

import java.util.Arrays;

public class BubbleSort {

	public static void main(String[] args) {
		int[] a = {9, 10, 1, 4, 8};
		int temp;
		
		for(int i = 1; i < a.length; i++) {
			for(int j=0; j < a.length - i; j++) {
				if(a[j] > a[j+1]) {
					temp = a[j];
					a[j] = a[j+1];
					a[j+1] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(a));

	}

}
