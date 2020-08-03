package ClassEx02;

import java.util.Scanner;

public class CylinderTest {

	public static void main(String[] args) {
		// 1. 원기둥 계산
		Cylinder c = new Cylinder();
		
		c.radius = 4;
		c.height = 5;
		double Volumne;
		Scanner input=new Scanner(System.in);
		
		System.out.printf("원기둥의 부피: %.2f\n", c.Volumne());
		System.out.printf("원기둥의 겉넓이: %.2f\n", c.Area());		

	}

}
class Cylinder {
	/*필드와 메소드를 구하시오.*/
	int radius; 
	int height;
	double Volumne() {
		return radius * radius * 3.141592 * height;
	}
	double Area() {
		return (radius*radius*3.141592)*2+(radius*2*3.141592*5);
	}

}
