package java_0927;

class Cake{
	public void yummy() {
		System.out.println("Yummy Cake");
	}
}

class CheeseCake extends Cake{
	public void yummy() {
		System.out.println("Yummy Cheese Cake");
	}
}


public class Caketest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Cake c1 = new CheeseCake();
		CheeseCake c2 = new CheeseCake();
		
		c1.yummy();
		c2.yummy();
	}

}
