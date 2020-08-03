package ClassEx02;

public class HeroTest {

	public static void main(String[] args) {
		// 연습문제 8 격투 게임
		// 두 싸움꾼 객체 생성
		Hero arthas = new Hero("아서스");
		Hero leona = new Hero("레오나");
		
		//격투 시작
		Hero.battle(arthas, leona);
	}
}
class Hero {
	//필드
	String name;
	int hp;
	
	//생성자
	public Hero(String str) {
		name = str;
		hp = 30;
	}
	
	//메소드(인스턴스 메소드)
	public void punch(Hero enemy) {
		/*1. (1-10)사이 랜덤 데미지를 입혀 상대의 hp를 줄인다*/
		int random = (int) (Math.random()*10)+1;
		enemy.hp-=random;
		
		System.out.printf("[%s]의 펀치:[%d]\n", name, random);
		System.out.printf("%s:[%d]/30\n", enemy.name, enemy.hp);
	}
	
	//메소드(클래스 메소드)
	public static void battle(Hero a, Hero b) {
		/*전투를 시작한다*/
		boolean firstAttack = true; //firstAttck이 참이면 a가 펀치를 날린다.
		while(a.hp>0&&b.hp>0) {/*영웅 hp가 남아있는 동안*/
			if(firstAttack) {
				b.punch(a);
			} else {
				a.punch(b);
			}
			firstAttack = !firstAttack;
		}
	}
}
