package java_0928;

class InstCnt{
	static int instNum = 0;
	
	InstCnt(){
		instNum ++;
		System.out.println("�ν��Ͻ� ���� : "+ instNum);
	}
}

public class ClassVar {

	public static void main(String[] args) {
		InstCnt cnt1 = new InstCnt();
		InstCnt cnt2 = new InstCnt();
		InstCnt cnt3 = new InstCnt();

	}

}
