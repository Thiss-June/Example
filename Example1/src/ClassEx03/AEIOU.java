package ClassEx03;

public class AEIOU {

	public static void main(String[] args) {
		// 연습문제 4. 자음 모음 계산
		//변수 생성
		String s = "Programming is fun! right?";
		
		//자음 모음 개수 세기
		int[] result = count(s);
		
		//결과 출력
		System.out.printf("%s\n => 자음 %d개, 모음 %d개", s, result[0], result[1]);
	}
	public static int[] count(String str) {
		int conso = 0; //자음
		int vowel = 0; //모음
		
		//문자열을 문자의 배열로 만듬
		//{'P','r','o','g','r','a','m','m','i','n','g',....,'?'}
		char[] characters = str.toCharArray();
		
		//모든 문자 배열을 순회하며 검사
		for (int i = 0; i<characters.length; i++) {
			switch(characters[i]) {
			//모음
			case 'A':
			case 'E':
			case 'I':
			case 'O':
			case 'U':
			case 'a':
			case 'e':
			case 'i':
			case 'o':
			case 'u':
				vowel++; //모음 따로
				break;
			case ' ':
			case '\t':
			case '\n':
			case ',':
			case '!':
			case '?':
			case '.':  //특수문자 제외
				break;
			//그 외 (자음)
			default:
				conso++;
				break;
			}
 		}	
		return new int[] {conso, vowel};
	}
}
