package ClassEx02;

public class FoodTest {

	public static void main(String[] args) {
		// 연습문제 2 음식문제
		Food chicken = new Food("치킨", 18000);
		Food pizza = new Food("피자", 28000);
		Food sushi = new Food("초밥세트", 22000);
		
		Food[] foods = {chicken, pizza, sushi};
		
		for (int i=0; i<foods.length; i++) {
			System.out.println(foods[i].toString());
		}
	}
}
class Food {
	/*1. 필드를 추가하세요*/
	String name;
	int price;
	public Food(String string, int i) {
		name = string;
		price = i;
	}
	/*2. 생성자를 추가하세요*/

	/*3. toString() 메소드를 추가하세요*/
	public String toString() {
		return String.format("Food{name:%s, price:%d}", name, price);
	}
}

