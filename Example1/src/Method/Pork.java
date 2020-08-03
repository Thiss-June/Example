package Method;

public class Pork {

	public static void main(String[] args) {
		// 삼겹살 3인분 계산
		/*1. 변수를 생성하시오.*/
		int Porkvalley=3;
		double g=5.179;
		double kcal=g(3);

		
		/*메소드를 통해 칼로리를 계산하시오*/
		System.out.printf("삼겹살 %d인분: %.2f kcal", Porkvalley, kcal);
		
	}
	public static double g(int Porkvalley) {
		double result = Porkvalley*5.179*180;
		return result;
	}
	
}
