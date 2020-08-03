package OOPEx;

public class CarFactoryTest {

	public static void main(String[] args) {
		CarFactory Factory = CarFactory.getInstance();
		Car mySonata = Factory.createCar();
		Car yourSonata = Factory.createCar();
		System.out.println(mySonata.getCarNumber());
		System.out.println(yourSonata.getCarNumber());

	}

}

class CarFactory {
	private static CarFactory instance = new CarFactory();
	//private 생성자: 외부 클래스에서 이 생성자를 사용 할 수 없음
	private CarFactory() {}
	
	//외부 클래스에서 사용 가능
	public static CarFactory getInstance() {
		if(instance == null) {
				instance = new CarFactory();
		}
		return instance;
	}


public Car createCar() {
	Car car = new Car();
	return car;
	}
}
class Car {
	public int CarNumber;
	public static int serialNum = 10000;
	
	Car() {
		serialNum++;
		CarNumber = serialNum;
		}
	public int getCarNumber() {
		return CarNumber;
	}
}
