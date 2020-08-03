package Method;

public class ProgrammingGrades {

	public static void main(String[] args) {
		// 메소드-5, 성적 확인
		int score1 = 96;
		int score2 = 85;
		int score3 = 76;
		
		System.out.printf("%d점 -> %s\n", score1, grade(score1));
		System.out.printf("%d점 -> %s\n", score2, grade(score2));
		System.out.printf("%d점 -> %s\n", score3, grade(score3));
	}
	public static String grade(int score) {
		/*메소드를 완성하시오.*/
		String grade ="";
		if(score >=95) {
			grade = "A+"; 
		}else if(score>=90) {
			grade = "B+";
		}else if(score>=80) {
			grade = "B0";
		}else{
			grade = "F";
		}
		return grade;
	}
}
