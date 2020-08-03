package Taxi;

public class MeterExam extends Taxi{

	public static void main(String[] args) {
		Taxi taxi = new Taxi();

		taxi.Start();
		taxi.Stop(2500);
	}
}
