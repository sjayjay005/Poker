/**
 * A Card class that simulates a basic card 
 * A Card has two properties , a Suit that it belongs to, and a value
 * @author Siphumelelise Ntshwenyese
 */
public class Card {
		String Suit;
		String Value;
		
		public Card() {}
		
		public Card(String suit, String value) {
			this.Suit = suit;
			this.Value = value;
		}
		
		//Access Methods
		public String getSuit() {
			return Suit;
		}
		
		public String getValue() {
			return Value;
		}
		
		//Mutator Methods
		public void setSuit(String newSuit) {
			this.Suit = newSuit;
		}
		
		public void setValue(String newValue) {
			this.Value = newValue;
		}
		
		//Action Methods
		public String toString() {
			return "\n"+"Suit: "+ this.Suit +"\n"+"Value:"+ this.Value+"\n"+"---------";
		}
}
