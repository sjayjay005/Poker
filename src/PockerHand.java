import java.lang.invoke.SwitchPoint;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * A class that simulates a poker a particular poker hand
 * This class contains pocker hand rankings and implements comparable, where it you can compare two poker hands 
 * @author Siphumelelise Ntshwenyese
 */
public class PockerHand implements Comparable<PockerHand> {
	//Properties of a poker hand
		private ArrayList<Card> hand; 
		private String[] suits;
		private String[] values;
		
		//At most the hand can have 5 cards, hence 5 suits as the maximum.
		private String[] suits() {
			String[] result = new String[5];
			for(int i = 0; i < hand.size(); i++) {
				result[i] = hand.get(i).getSuit();
			}
			return result;
		}
		
		//At most the hand can have 5 cards, hence 5 values as the maximum.
		private String[] values() {
			String[] result = new String[5];
			for(int i = 0; i < hand.size(); i++) {
				result[i] = hand.get(i).getValue();
			}
			return result;
		}
		
		/**
		 * Constructor
		 */
		public PockerHand() {}
		
		/**
		 * Constructor
		 * @param cards
		 */
		public PockerHand(ArrayList<Card> cards) {
			hand = cards;
			suits = suits();
			values = values();	
			
			Arrays.sort(suits);
			Arrays.sort(values);
		}
		
		public ArrayList<Card> cards(){
			return hand;
		}
				
		/**
		 * 
		 * @return String "One Pair" if values list has at least one pair of values
		 */
		public String isPair() {
			String result = "";
			String value = "";
	        for (int i = 0; i < values.length - 1; i++) {
	            if (values[i] == values[i + 1]) {
	            	value = values[i];
	                result = "One pair";
	            }
	        }
	        return result;
		}

		/**
		 * 
		 * @return String "Two Pair" if values list has at least two pair of values 
		 */
		public String isTwoPair() {
			String result = "";
			String value = "";
			int counter = 0; //Counts the number of pairs
			for(int i = 0; i < values.length - 1 ;i++) {
				if(values[i] == values[i + 1]) {
					counter++;	
					value = values[i]; 
				}
			}
			if( counter == 2) {
				result = "Two Pair";
			}
			return result;
		}

		/**
		 * 
		 * @return String "Three of a Kind" if the values list has at least 3 of values of different suits
		 */
		public String isThreeOfAKind() {
			  String result = "";
			  String value = "";
		        int counter = 0;
		        for (int i = 0; i < values.length - 2; i++) {
		            if (values[i] == values[i + 1] && values[i] == values[i + 2]) {
		            	value = values[i];
		                result = "Three of a kind";
		            }
		        }
		        return result;
		}
		
		/**
		 * 
		 * @return String "Four of a Kind" if the values list has at least 4 of values of different suits 
		 */
		public String isFourOfAKind() {
			 String result = "";
			 String value = "";
		     int counter = 0;  
		     for (int i = 0; i < values.length - 3; i++) {
		            if (values[i] == values[i + 1] && values[i] == values[i + 2] && values[i] == values[i + 3]) {
		                value = values[i];
		                result = "Four of a Kind";
		            }
		        }
		        return result;
		}

		/**
		 * 
		 * @return
		 */
		private String isStraight() {
			// TODO Create an isStraight implementation
				return "";
		}

		public String isFlush() {
			 String result = "";
			 String value = "";
			 String suit = suits[0];
		     for (int i = 0; i < suits.length; i++) {
		    	 value = values[i];
		    	 result = "Flush";
		    	 if (suits[i].equals(suit) == false) {
		    		 result = "";
		         }
		     }
		     return result;
		}

		public String isFullHouse() {
			 String result = "";
		        boolean one = false;
		        boolean two = false;
		        String value = "";
		        for (int i = 0; i < values.length - 2; i++) {
		            if (values[i] == values[i + 1] && values[i] == values[i + 2]) {
		                one = true;
		            }
		        }
		        if (values[3] == values[4]) {
		            two = true;
		        }
		        if (one && two) {
		        	value = values[values.length - 1];
		        	result = "Full House";
		        }
		        
		        return result;
		}


		private String isStraightFlush() {
			// TODO create an isStraightFlush implementation
		     return "";
		}

		@Override
		public int compareTo(PockerHand arg0) {
			// TODO Auto-generated method stub
			return 0;
		}
}
