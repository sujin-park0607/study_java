import java.util.*;

class Grade{
	int math;
	int science;
	int english;
	
	public Grade(int math,int science,int english) {
		this.math = math;
		this.science = science;
		this.english = english;
	}
	
	public double average() {
		return (this.math + this.science + this.english) / 3.0; 
	}
}

public class GradeTest {

	public static void main(String[] args) {
		  Scanner sc = new Scanner(System.in);

		   System.out.print("����, ����, ���� ������ 3���� ���� �Է� >> ");
		   int math = sc.nextInt();
		   int science = sc.nextInt();
		   int english = sc.nextInt();
		   Grade me = new Grade(math, science, english);
		   System.out.println("����� "+me.average()); // average()�� ����� ����Ͽ� ����

		   sc.close();
		
	}

}


