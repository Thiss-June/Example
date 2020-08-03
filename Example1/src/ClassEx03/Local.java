package ClassEx03;

public class Local {

	public static void main(String[] args) {
		// 배열 생성
		String[] cities = {"서울", "부산", "인천", "대전", "대구"}; /*1. 도시를 배열로 입력하시오.*/
		int[] visitors = {599, 51, 46, 43, 27}; /*2. 방문자 수를 배열에 저장하시오.*/
		
		for (int i = 0; i<cities.length;i++) {
			/*3. 결과를 출력하시오.*/
		System.out.printf("%s: %d명\n", cities[i], visitors[i]);
			}
	}

}