package edu.lion.car;

//1.모든 변수는 무조건 private
//2. 모든 변수에 대해서 getter, setter 함수를 만들어서 값을 읽고 쓴다.
//3. 하나의 파일에서 진입점이 되는 부분 하나만 public이 가능하다.
//4. 생성자 public 
public class Clock {
	
	private int hh;
	public int getHh() {
		return hh;
	}


	public void setHh(int hh) {
		this.hh = hh;
	}


	public int getMm() {
		return mm;
	}


	public void setMm(int mm) {
		this.mm = mm;
	}


	private int mm;
	
	
	public Clock(double r) {
		
	}
}

