package homwork;

import java.util.Arrays;

public class SelectionSortTest {
	public static int[] selectionSort(int[] a) {
		int temp;
		int idx;
		
		for(int i = 0; i < a.length; i++) {
			idx = i;
			for(int j=i+1; j < a.length; j++) {
				if(a[idx] > a[j]) {
					idx = j;
				}
			}
			temp = a[i];
			a[i] = a[idx];
			a[idx] = temp;			
		}
		return a;
	}

	public static void main(String[] args) {
		
		int[] a = {7, 3, 2, 8, 9, 4, 6, 1, 5};
		System.out.println(Arrays.toString(selectionSort(a)));
		
	}
	
}
