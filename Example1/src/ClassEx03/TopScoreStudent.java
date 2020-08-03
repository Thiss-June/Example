package ClassEx03;

public class TopScoreStudent {

	public static void main(String[] args) {
		// 연습문제 8. 1등 찾기
		//배열 생성
		String[] names = {"Elena", "Suzie", "John", "Emily", "Neda", "Kate", "Alex", "Daniel", "Hamilton"}; /*1. 이름을 배열로 만드세요*/
		int[] scores = {65, 74, 23, 75, 68, 96, 88, 98, 54}; /*2. 점수를 배열로 만드세요*/
		
		//1등 인덱스 검색
		int i = topIndex(scores);

		
		//결과 출력
		System.out.printf("1등: %s(%d점)\n", names[i], scores[i]);
	}
	//정수형 배열을 입력받아 가장 큰값의 인덱스를 반환
	public static int topIndex(int[] arr) {
		/*해당 함수를 완성하세요*/
		int index=0;
		int temp=0;
		
 		for(int i=0; i<arr.length; i++) {
 			 if(arr[i]>temp) { //temp값보다 arr[i]값이 클 경
 				 temp=arr[i];  //temp 값을 큰값으로 변경
 				 index=i;      //그때 인덱스 값을 저장
 			 	}
 			} 				
		return index;
	}
}
