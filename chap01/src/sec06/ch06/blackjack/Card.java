package sec06.ch06.blackjack;

public class Card {

	private String pattern;
	private String symbol;
	
	public Card() {
	}
	
	public Card(String pattern, String symbol) {
		super(); //생략가능
		this.pattern = pattern;
		this.symbol = symbol;
	}
	
	public String getPattern() {
		return pattern; // this.pattern; -> 이렇게 해도 됨!
	}
	
	public String getSymbol() {
		return symbol;
	}
	
	@Override
	public String toString() {
		return pattern + " (" + symbol + ")" ;
	}


}
