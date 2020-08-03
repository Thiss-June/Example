package ClassEx;


public class PointTest {

	public static void main(String[] args) {
		// 두 점사이의 거리
		//객체 생성
		Point p1 = new Point(0,0);
		Point p2 = new Point(3,4);
		//거리 계산
		double dist = Point.distance(p1, p2);
		//결과 출력
		System.out.printf("두 점 A%s, B%s 사이의 거리: %.2f", 
				p1.toStr(), p2.toStr(), dist);
	}
}
class Point {
	int x; //포인트 클래스의 x좌표
	int y; //포인트 클래스의 y좌표
	Point (int _x, int _y) {
		x = _x;
		y = _y;
	}
	String toStr() { //String.format("%d%s%f", 정수, 문자열, 실수);
		return String.format("(%d, %d)", x, y);
	}
	//스태틱 클래스 메소드 Point.distance()
	static double distance(Point p, Point q) {
		double dX = p.x - q.x; //x좌표의 변화량
		double dY = p.y - q.y; //y좌표의 변화량 
		return Math.sqrt((dX*dX)+(dY*dY)); //Math 라이브러리 제곱근
	}
}