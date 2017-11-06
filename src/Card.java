/**
 * A Card class that simulates a basic card 
 * A Card has two properties , a Suit that it belongs to, and a value
 * @author Siphumelelise Ntshwenyese
 */
public class Card {
		String Suit;
		String Value;
		
		/**
		 * Card Constructor
		 */
		public Card() {}
		

		/**
		 * Card Constructor
		 * @param suit, a String suit of card
		 * @param value a String value for the card
		 */
		public Card(String suit, String value) {
			super();
			this.Suit = suit;
			this.Value = value;
		}
		
		//Access Methods
		/**
		 * @return A Suit which a card belongs to
		 */
		public String getSuit() {
			return Suit;
		}
		
		/**
		 * @return a Value which a card has
		 */
		public String getValue() {
			return Value;
		}
		
		//Mutator Methods
		/**
		 * Change the Suit assigned to a Card
		 * @param newSuit
		 */
		public void setSuit(String newSuit) {
			this.Suit = newSuit;
		}
		
		/**
		 * Change the Value assigned to a Card
		 * @param newValue
		 */
		public void setValue(String newValue) {
			this.Value = newValue;
		}
		
		//Action Methods
		/**
		 * Display a card to the user
		 */
		/**
		 * Compare Two Cards
		 * @param anotherString
		 * @return
		 */
		public int compareTo(String anotherString) {
			return Suit.compareTo(anotherString);
		}
		
		public String toString() {
			return "\n"+"Suit: "+ this.Suit +"\n"+"Value:"+ this.Value+"\n"+"---------";
		}
}
