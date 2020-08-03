package Method;

public class Diet {

	public static void main(String[] args) {
		// 메소드-11 다이어트(BMI)지수
		//변수 생성
		double w = 81.6;
		double t = 1.76;
		
		//BMI 계산
		double BMIRate = calculate(w,t);
		
		//결과 출력
		System.out.printf("BMT: %.2f(%.1fkg, %.2fm)\n", BMIRate, w, t);
		System.out.printf("결과: %s입니다.\n", BMI(BMIRate));
	}
		//몸무게와 키를 입력 받아, bmi 지수를 반환
	public static double calculate(double weight, double tall) {
		/*해당 메소드를 완성하시오*/

		double BMIRate = weight/Math.pow(tall,2);
		return BMIRate;
	}
		//bmi 지수를 입력받아, 비만 결과를 반환
	public static String BMI(double BMIRate) {
		String BMI = "";
		/*해당 메소드를 완성하시오.*/
		if(BMIRate>30) {
			BMI = "비만";
		}
		if(BMIRate>25&&BMIRate<30) {
			BMI = "과체중";
		}
		if(BMIRate>18.5&&BMIRate<25) {
			BMI = "정상";
		}
		if(BMIRate<18.5) {
			BMI = "저체중";
		}
			
		return BMI;
	}
}
