package ClassEx;

public class SquareTest {

	public static void main(String[] args) {
		// 정사각형 객체의 넓이를 구하는 예
		/*1. 객체 생성*/
		Square s = new Square();
		Square s1 = new Square();
		/*2. 필드 초기화(값 변경)*/
		s.length = 4;
		s1.length = 6;
		/*결과 출력*/
		System.out.printf("한 변의 길이가 %d인 정사각형의 넓이: %d%n", s.length, s.area());
		System.out.printf("한 변의 길이가 %d인 정사각형의 넓이: %d%n", s1.length, s1.area());
	}

}
		/*4. 정사각형 클래스 구현*/
class Square {
	int length; //길이
	//넓이 반환
	int area() {
		return length*length;
	}
}

/*소수점 표현할 시*/
//public class SquareTest {
//
//	public static void main(String[] args) {
//		// 정사각형 객체의 넓이를 구하는 예
//		/*1. 객체 생성*/
//		Square s = new Square();
//		/*2. 필드 초기화(값 변경)*/
//		s.length = 3.14;
//		/*결과 출력*/
//		System.out.printf("한 변의 길이가 %.2f인 정사각형의 넓이: %.2f", s.length, s.area());
//	}
//
//}
//		/*4. 정사각형 클래스 구현*/
//class Square {
//	double length; //길이
//	//넓이 반환
//	double area() {
//		return length*length;
//	}
//}