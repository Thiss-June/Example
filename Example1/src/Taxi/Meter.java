package Taxi;

public interface Meter {
	public int BASE_FARE = 3000;
	public abstract void Start();
	public abstract void Stop(int distance);
}
