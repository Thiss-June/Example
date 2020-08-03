package OOPEx;

public class CoffeeBrand2 {
	String CoffeeBrand2;
	int ManCount;
	int money;
	
	public CoffeeBrand2(String CoffeeBrand2) {
		this.CoffeeBrand2 = CoffeeBrand2;
	}
	public void take(int money) {
		this.money += money;
		ManCount++;
	}
	public void showInfo() {
	System.out.println(CoffeeBrand2+"의 카페라뗴를 시킨 사람은"
	+ManCount+"명이고, 수입은"+money+"입니다.");
	}

}
