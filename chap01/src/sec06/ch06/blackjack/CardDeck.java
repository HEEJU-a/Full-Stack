package sec06.ch06.blackjack;

public class CardDeck {

	private final Card[] CARD_ARR = new Card[52];
	
	String[] pattern = {"Spades", "Hearts", "Diamonds", "Clubs"};
	String[] symbole = {"A", "2", "3", "4","5", "6", "7", "8", "9", "10", "J", "Q", "K"};
 	
	
	public CardDeck() {
		int cnt = 0;
		for(int i = 0; i < pattern.length; i++) {
			for(int n = 0; n < symbole.length; n++) {
				CARD_ARR[cnt++] = new Card(pattern[i], symbole[n]);
			}
		}
		
	}
	
	public void print() {
		for(Card card2 : CARD_ARR) {
			System.out.println(card2);
		}
	}
	
	
	public Card getOneCard(){
		//반복문
		//랜덤값 생성
		//랜덤한 카드를 뽑았는데 null이 아닐때
		//랜덤한 카드를 뽑음
		//뽑은 카드를 null로 바꿈
		//뽑은 카드 리턴
		
		Card result;
		
		while(true) {
		int random = (int)(Math.random() * CARD_ARR.length);
		
		if(CARD_ARR[random] != null) {
			result = CARD_ARR[random];
			System.out.println(result);//-> 값 확인하고싶을때!
			CARD_ARR[random] = null;
			return result;
		}
		
	}
		
	
	}
	
	
}


