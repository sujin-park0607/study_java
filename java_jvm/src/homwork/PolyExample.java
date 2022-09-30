package homwork;

class Buyer {
	int money = 1000;
	Product[] cart = new Product[3]; // 구입한 제품을 저장하기 위한 배열

	int i = 0; // Product배열 cart에 사용될 index


	void buy(Product p) {
		if(money < p.price) {
			System.out.println("돈이 부족해서 "+p+"를 살 수 없습니다.");
			return;
		}
		else {
			this.money -= p.price;
			this.add(p);
		}
	}



	void add(Product p) {
		Product[] cart2 = null;
		
		if(i >= cart.length) {
			cart2 = new Product[cart.length * 2];
			for(int j=0; j < cart.length; j++) {
				cart2[j] = cart[j];
			}
			cart = cart2;
		}
		cart[i++] = p;
		

	} // add(Product p)



	void summary() {
		int total = 0;
		System.out.print("구입한 목록: ");
		
		for(int j=0; j < cart.length; j++) {
			System.out.print(cart[j]+", ");
			total += cart[j].price;
		}
		System.out.println();
		System.out.println("총금액 : " + total + "원");
		System.out.println("남은돈 : " + money);


	}

}



class Product {

	int price; // 제품의 가격



	Product(int price) {

		this.price = price;

	}

}



class Tv extends Product {

	Tv() {

		super(100);

	}



	public String toString() {

		return "Tv";

	}

}



class Computer extends Product {

	Computer() {

		super(200);

	}



	public String toString() {

		return "Computer";

	}

}



class Audio extends Product {

	Audio() {

		super(50);

	}



	public String toString() {

		return "Audio";

	}

}

class PolyExample {

	public static void main(String args[]) {

		Buyer b = new Buyer();
		b.buy(new Tv());
		b.buy(new Computer());
		b.buy(new Tv());
		b.buy(new Audio());
		b.buy(new Computer());
		b.buy(new Computer());
		b.buy(new Computer());

		b.summary();

	}

}
