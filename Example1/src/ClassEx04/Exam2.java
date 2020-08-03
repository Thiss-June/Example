package ClassEx04;

public class Exam2 {

	public static void main(String[] args) {
		Circle c = new Circle(4);
//		c.radius = 4;
		System.out.printf("반지름이 %d인 원의 넓이: %.2f", c.radius, c.area());
	}

}

class Circle {
	/*필드와 메소드를 구하시오.*/
	int radius; 
	
	public Circle(int i) {
		radius=i;
	}
	double Volumne() {
		return radius * radius * 3.141592;
	}
	double area() {
		return (radius*radius*3.141592);
	}
}