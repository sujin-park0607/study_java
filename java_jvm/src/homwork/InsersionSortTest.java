package homwork;

import java.util.Arrays;

public class InsersionSortTest {
	public static int[] solution(int[] arr) {
		int temp;
		
		for(int i=1; i < arr.length; i++) {	
			
			for(int j=i; j >= 1; j--) {
				if(arr[j] < arr[j-1]) {
					temp = arr[j-1];
					arr[j-1] = arr[j];
					arr[j] = temp;
				}
			}
		}	
		
		return arr;
	}
	
	public static void main(String[] args) {
		int[] arr = {5, 1, 3, 8, 2, 7, 6};
		solution(arr);
		System.out.println(Arrays.toString(solution(arr)));

	}

}
