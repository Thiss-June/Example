package InterfaceExtends;

public class CurrencyTest {

	public static void main(String[] args) {
		// 연습문제 3. 환율
		KRW krw = new KRW(1500, "원");
		USD usd = new USD(100.50, "달러");
		EUR eur = new EUR(260.87, "유로");
		JPY jpy = new JPY(1400, "엔");
		
		Currency[] currencies = {krw, usd, eur, jpy};
		
		for(Currency c : currencies) {
			System.out.println(c.toString());
		}
	}
}

class Currency{
	protected double amount;
	protected String notation;
	
	Currency(double amount, String notation) {
		this.amount = amount;
		this.notation = notation;
	}
	public String toString() {
		return String.format("화폐 : 원");
	}
}

class KRW extends Currency {
	public KRW(double amount, String notation) {
		super(amount, notation);
	}
	public String toString() {
		return String.format("KRW: %.2f원", super.amount);
	}
}

class USD extends Currency {
	public USD(double amount, String notation) {
		super(amount, notation);
	}
	public String toString() {
		return String.format("USD: %.2f달러", super.amount);
	}
}

class EUR extends Currency {
	public EUR(double amount, String notation) {
		super(amount, notation);
	}
	public String toString() {
		return String.format("EUR: %.2f유로", super.amount);
	}
}

class JPY extends Currency {
	public JPY(double amount, String notation) {
		super(amount, notation);
	}
	public String toString() {
		return String.format("JPY: %.2f엔", super.amount);
	}
}
