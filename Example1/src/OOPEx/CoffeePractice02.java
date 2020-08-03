package OOPEx;



public class CoffeePractice02 {

	public static void main(String[] args) {
		CoffeePractice Kim = new CoffeePractice("Kim", 5000);
		CoffeePractice Lee = new CoffeePractice("Lee", 10000);

		CoffeeBrand 별다방 = new CoffeeBrand("별다방");
		Kim.CoffeeBrand(별다방);
		Kim.showInfo();
		별다방.showInfo();
		
		CoffeeBrand2 콩다방 = new CoffeeBrand2("별다방");
		Lee.CoffeeBrand2(콩다방);
		Lee.showInfo();
		콩다방.showInfo();
	}

}

//		Bus bus100 = new Bus(100); //노선 100버스 생성
//		James.takeBus(bus100);
//		James.showInfo();
//		bus100.showInfo();
//		
//		Subway subwayGreen = new Subway("2호선");
//		Thomas.takeSubway(subwayGreen);
//		Thomas.showInfo();
//		subwayGreen.showInfo();
//		
//		Taxi taxi = new Taxi(5481);
//		Martin.takeTaxi(taxi);
//		Martin.takeBus(bus100);
//		Martin.takeSubway(subwayGreen);
//		Martin.showInfo();
//		taxi.showInfo();
//		bus100.showInfo();
//		subwayGreen.showInfo();
//	}
//
//}
//
//class Taxi {
//	int taxiNumber;
//	int PassengerCount;
//	int money;
//	public Taxi(int number) {
//		taxiNumber = number;
//	}
//	public void take(int money) {
//		this.money += money; //버스 수입 증가
//		PassengerCount++; //승객 수+1
//	}
//	public void showInfo() {
//		System.out.println("택시"+taxiNumber+"번의 승객은"+PassengerCount+"명이고, 수입은"+money+"입니다.");
//	}
//}
