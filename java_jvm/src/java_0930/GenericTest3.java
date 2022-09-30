package java_0930;


public class GenericTest3 {
	
	public static void printArray(Object[] arrs) {
		for (Object obj : arrs) {
			System.out.println(obj);
		}
	}
	public static void main(String[] args) {
		Integer[] intArray = {1, 2, 3};
		String[] stringArray = {"Hello", "World"};
		
		printArray(intArray);
		printArray(stringArray);
	}

}
