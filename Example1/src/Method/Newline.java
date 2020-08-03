package Method;

public class Newline {

	public static void main(String[] args) {
		// 라인 만들기
		System.out.println("Line 1");
		threeLines();
		System.out.println("Line 2");
	}
	
	public static void threeLines() {
		oneLine();
		oneLine();
		oneLine();
		
	}
	
	public static void oneLine() {
		
		System.out.println("<");
	}

}
