package java_0928;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ThrowsTest {

	public static void main(String[] args) throws IOException {
		
		byte[] byteArr = {'a','b','c'};
		
		System.out.write(byteArr);
//		try {
//			System.out.write(byteArr);
//		}catch(IOException e) {
//			e.printStackTrace();
//		}
		
		try {
			FileReader fr = new FileReader("test.txt");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		

	}

}
