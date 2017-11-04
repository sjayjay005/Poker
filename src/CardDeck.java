import java.util.ArrayList;
import java.util.Collections;

/***
 * The Card Deck class simulates a simple Deck of Cards
 * @author Siphumelelise Ntshwenyese
 */
public class CardDeck {
		String[] deckValue = {"A","1","2","3","4","5","6","7","8","9","10","K","Q","J"};
		String[] deckSuit = {"Spades","Clubs","Hearts","Diamonds"};
		//int deckSize = 52;
		
		ArrayList<Card> cards = new ArrayList<Card>();
		
		// Instantiate a CardDeck and Immediately Shuffle it
		public CardDeck(){
			for(int suit = 0; suit < deckSuit.length; suit ++) {
				for(int value = 0; value < deckValue.length; value ++) {
					this.cards.add(new Card( deckSuit[suit], deckValue[value] ));
				}
			}
			Collections.shuffle(this.cards);
		}
		
		//Access Methods
		public ArrayList<Card> getDeck() {
			return this.cards;
		}
		
		//Mutator Methods
		
		
		//Action Methods
		
		
		
}