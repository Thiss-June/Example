package OOPEx;



public class CoffeePractice {
	//p.197 5번 문제
	public String ManName;
	public int Coffee;
	public int money;
	
	public CoffeePractice(String ManName, int money) {
		this.ManName = ManName;
		this.money = money;
	}
	public void CoffeeBrand(CoffeeBrand coffee1) {
		coffee1.take(4000);
		this.money -= 4000;
	}
	public void CoffeeBrand2(CoffeeBrand2 coffee2) {
		coffee2.take(4500);
		this.money -= 4500;
	}
	public void showInfo() {
	System.out.println(ManName+"님의 남은 돈은"+money+"입니다.");
	}
}
