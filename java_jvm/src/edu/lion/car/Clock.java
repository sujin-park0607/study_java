package edu.lion.car;

//1.��� ������ ������ private
//2. ��� ������ ���ؼ� getter, setter �Լ��� ���� ���� �а� ����.
//3. �ϳ��� ���Ͽ��� �������� �Ǵ� �κ� �ϳ��� public�� �����ϴ�.
//4. ������ public 
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
