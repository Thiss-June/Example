package Method;

public class TwelveAnimals {

	public static void main(String[] args) {
		// 메소드-9 동물 띠
		printAnimal(1986);
		printAnimal(1990);
		printAnimal(2000);
	}

	
//	switch(rank) {
//	case 1: 
//		System.out.println("금메달 입니다.");
//		break; //switch 문을 종료
	private static String printAnimal(int birthYear) {
		String printAnimal = "";
		switch (birthYear %12) {
			case 0:
				printAnimal = "쥐";
				break;
			case 1:
				printAnimal = "소";
				break;
			case 2:
				printAnimal = "호랑이";
				break;
			case 3:
				printAnimal = "토끼";
				break;
			case 4:
				printAnimal = "용";
				break;
			case 5:
				printAnimal = "뱀";
				break;
			case 6:
				printAnimal = "말";
				break;
			case 7:
				printAnimal = "양";
				break;
			case 8:
				printAnimal = "원숭이";
				break;
			case 9:
				printAnimal = "닭";
				break;
			case 10:
				printAnimal = "개";
				break;
			case 11:
				printAnimal = "돼지";
				break;


		}
		System.out.printf("%d년=>%s띠\n", birthYear, printAnimal);
		return printAnimal;
	}
	

}
