package ClassEx02;

import java.util.jar.Attributes.Name;

public class MinerTest {

	public static void main(String[] args) {
		// 연습문제 3. 코인 채굴
		/*1. 두 갱부 객체를 생성하시오.*/
		Miner malon = new Miner("말론");
		Miner gloria = new Miner("글로리아");		
		/*2. 코인을 채굴하시오.*/
		malon.mine();
		malon.mine();
		malon.mine();
		gloria.mine();
		gloria.mine();
		
		System.out.println(malon.toString());
		System.out.println(gloria.toString());
		/*3. 객체 정보를 출력하세요.*/	
	}
}

class Miner {
	//필드 (인스턴스 변수)
	String name;
	int coins;
	

	//생성자
	public Miner(String string) {
		name = string;
		coins = 0;
	}
	// 메소드(인스턴스 메소) - 객체의 정보를 문자열로 변환
	public String toString() {
		return String.format("Miner { name:%s, coins: %d}", name, coins);
		
	}
	//메소드(인스턴스 메소드) - 코인채굴
	public void mine() {
		coins += 1;
	}
} 