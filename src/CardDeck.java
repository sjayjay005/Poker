import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

/**
 * The Card Deck class that simulates a simple Deck of Cards
 * A Deck has 52 Cards (A,K,Q,J & numbers 2-10 respectively )
 * A Deck has 4 Suits (Spades, Clubs, Hearts & Diamonds)
 * @author Siphumelelise Ntshwenyese
 */
public class CardDeck {
		//Defining a Card Deck's Basic Properties
		private String[] deckValue = {"A","2","3","4","5","6","7","8","9","10","K","Q","J"};
		private String[] deckSuit = {"Spades","Clubs","Hearts","Diamonds"};
		private static final int deckSize = 52;
		private ArrayList<Card> cards = new ArrayList<Card>();
		
		
		/**
		 * Constructor
		 */
		public CardDeck(){
			for(int suit = 0; suit < deckSuit.length; suit ++) {
				for(int value = 0; value < deckValue.length; value ++) {
					this.cards.add(new Card( deckSuit[suit], deckValue[value] ));
				}
			}
			ShuffleDeck();
		}
		
		/**
		 * Constructor
		 * @param deckValue
		 * @param deckSuit
		 * @param cards
		 */
		public CardDeck(String[] deckValue, String[] deckSuit, ArrayList<Card> cards) {
			super();
			this.deckValue = deckValue;
			this.deckSuit = deckSuit;
			this.cards = cards;
		}
			
		
		//Access Methods
		/**
		 * @return An ArrayList of Deck Cards
		 */
		public ArrayList<Card> getDeck() {
			return this.cards;
		}
	
		public String[] getDeckValue() {
			return deckValue;
		}
		public String[] getDeckSuit() {
			return deckSuit;
		}
		public ArrayList<Card> getCards() {
			return cards;
		}
		public static int getDecksize() {
			return deckSize;
		}
		
		//Mutator methods
		public void setDeckSuit(String[] deckSuit) {
			this.deckSuit = deckSuit;
		}
		public void setDeckValue(String[] deckValue) {
			this.deckValue = deckValue;
		}
		public void setCards(ArrayList<Card> cards) {
			this.cards = cards;
		}

		
		//Action Methods
		
		/**
		 * @return A random Card of type Card from the deck
		 */
		public Card getRandomDeckCard() {
			Random generator = new Random();
			int randomCard = generator.nextInt(deckSize);
			return this.cards.get(randomCard);
		}
		
		/**
		 * 
		 * @return check if the deck is empty
		 */
		public boolean isEmpty() {
			return cards.isEmpty();
		}

		/**
		 * Removes a card from deck given an index
		 * @param index
		 * @return
		 */
		public Card removeCardFromDeck(int index) {
			return cards.remove(index);
		}

		/**
		 * Shuffle a deck of cards
		 */
		public void ShuffleDeck() {
			Collections.shuffle(this.cards);
		}
		
		//TODO Remove Random Card from Deck
}