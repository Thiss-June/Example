package Method;

public class Walking {

	public static void main(String[] args) {
		// 칼로리 계산
		/*1.칼로리 계산을 위해 메소드를 호출하시오.*/
		/*3.결과를 출력하시오.*/
		double Kcal = kcal(5000);
		System.out.println("소모 칼로리:"+kcal(5000)+"kcal");
 
	}
	
	/*2.칼로리 계산 메소드를 정의하시오.*/
	public static double kcal(int Step) {
		double result = Step*0.02;
		return result;
	}

}
