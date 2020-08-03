package Method;

public class Elevator {

	public static void main(String[] args) {
		//메소드-8, 엘리베이터
		//변수 생성
		int a = 13;
		int b = 7;
		int c = 10;
		
		//결과 출력
		System.out.printf("%d층 -> %s 엘리베이터\n", a, elevator(a));
		System.out.printf("%d층 -> %s 엘리베이터\n", b, elevator(b));
		System.out.printf("%d층 -> %s 엘리베이터\n", c, elevator(c));
	}
	public static String elevator(int Elevator) {
		/*메소드를 완성하시오.*/
		String elevator = "";
		if(Elevator >=1 && Elevator <=10) {
			elevator = "저층";
		}
		if(Elevator >=11 && Elevator <=20) {
			elevator = "고층";
		}
		return elevator;
	}
}