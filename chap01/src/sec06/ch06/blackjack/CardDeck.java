package sec06.ch06.blackjack;

public class CardDeck {
	
	private final Card[] CARD_ARR = new Card[52];
	
	String[] pattern = {"Spades", "Hearts", "Diamonds", "Clubs"};
	String[] symbole = {"A", "2", "3", "4","5", "6", "7", "8", "9", "10", "J", "Q", "K"};
 	
	
	public CardDeck() {
		int cnt = 0;
		for(int i = 0; i < pattern.length; i++) {
			for(int n = 0; n < symbole.length; n++) {
				CARD_ARR[cnt++] = new Card(pattern[i], symbole[i]);
			}
		}
		
	}
	
	public void print() {
		for(int i = 0; i < CARD_ARR.length; i++) {
			System.out.println(CARD_ARR);
		}
	}
	
}


