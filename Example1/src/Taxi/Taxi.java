package Taxi;

public class Taxi implements Meter{

	@Override
	public void Start() {
		System.out.println("운행을 시작합니다.");
	}

	@Override
	public void Stop(int distance) {
		int fare = BASE_FARE+(distance*2);
		System.out.println("운행을 종료합니다."+"요금은"+fare+"원 입니다.");
	}

}
