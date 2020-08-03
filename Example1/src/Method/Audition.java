package Method;

public class Audition {

	public static void main(String[] args) {
		// 메소드-7, 삼항연산자
		//변수 생성
		double tomVocal = 8.8;
		double tomDance = 7.6;
		double kateVocal = 9.2;
		double kateDance = 7.8;
		
		double result1 = tomVocal*tomDance;
		double result2 = kateVocal*kateDance;
		//결과 출력
		System.out.printf("Tom 오디션 결과:%.2f, %s\n",result1, test(tomVocal, tomDance));
		System.out.printf("Kate 오디션 결과:%.2f, %s\n",result2, test(kateVocal, kateDance));
	}
		//보컬과 댄스 성적을 토대로 결과 문자열을 반환
	public static String test(double vocal, double dance) {
		return (vocal*dance >= 70)? "통과":"실패";
	}
}
