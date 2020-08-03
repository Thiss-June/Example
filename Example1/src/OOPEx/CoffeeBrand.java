package OOPEx;

public class CoffeeBrand {
	String CoffeeBrand;
	int ManCount;
	int money;
	
	public CoffeeBrand(String CoffeeBrand) {
		this.CoffeeBrand = CoffeeBrand;
	}
	public void take(int money) {
		this.money += money;
		ManCount++;
	}
	public void showInfo() {
	System.out.println(CoffeeBrand+"의 아메리카노를 시킨 사람은"
	+ManCount+"명이고, 수입은"+money+"입니다.");
	}
}

