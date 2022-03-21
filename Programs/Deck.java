package Programs;
import java.util.ArrayList;

public class Deck {

	public ArrayList<Card> deck;
	
	public Deck() {
		deck = new ArrayList<Card>();
		for(int i = 1; i< 13; i++) {
			
			deck.add(new Card ("Diamond", i));
			deck.add(new Card ("Heart", i));
			deck.add(new Card ("Spade", i));
			deck.add(new Card ("Club", i));
			
		}
	}
	
	public ArrayList<Card> getDeck(){
		return deck;
	}
	
	public Card drawCard() {
		return deck.remove(0);
	}
}

