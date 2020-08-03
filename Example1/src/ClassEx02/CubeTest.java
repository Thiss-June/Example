package ClassEx02;

public class CubeTest {

	public static void main(String[] args) {
		// 연습문제 4. 정육면체 문제
		Cube a = new Cube(3);
		Cube b = new Cube(5);
		
		// 두 정육면체의 부피와 겉넓이 출력
		System.out.printf("정육면체 a의 부피: %d, "
				+ "겉넓이: %d\n", a.volumne(), a.surfaceArea());
		System.out.printf("정육면체 b의 부피: %d, "
				+ "겉넓이: %d\n", b.volumne(), b.surfaceArea());
	}

}

class Cube {
	//필드
	int length; //한 변의 길이
	
	//생성자
	public Cube(int i) {
		/*1. 생성자를 완성하세요.*/
		length = i;
	}
	//메소드(인스턴스 메소드) - 정육면체 부피 변환
	public int volumne() {
		/*2. 부피를 반환하세요.*/
		return length*length*length;
	}
	//메소드(인스턴스 메소드) - 정육면체 겉넓이 변환
	public int surfaceArea() {
		/*3. 메소드를 완성하세요.*/
		return 6*length*length;
	}
}