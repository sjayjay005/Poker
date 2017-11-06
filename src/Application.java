import java.util.ArrayList;
import java.util.Scanner;
/**
*Since we are working with Objects, we must parse the string in the following form
*(AS,10C,10H,3D,3S)
*To be in object form:
*
*Card c1 = new Card("Spades","Ace");
*Card c2 = new Card("Clubs","10");
*Card c3 = new Card("Hearts","10");
*Card c4 = new Card("Diamonds","3");
*Card c5 = new Card("Spades","3");
*/
public class Application {

	public static void main(String[] args) {
		
			ArrayList<Card> myPockerHand = convertStringToObject("AS,10C,10H,3D,3S");
			
			PockerHand myHand = new PockerHand(myPockerHand);
			System.out.println(myHand.isTwoPair());
			System.out.println(myHand.isFlush());
			System.out.println(myHand.isPair());
			System.out.println(myHand.isThreeOfAKind());
			System.out.println(myHand.isFourOfAKind());
			System.out.println(myHand.isFullHouse());
			
		
		
		
//			Card card1 = new Card("Spades","Ace");
//			Card card2 = new Card("Clubs","10");
//			Card card3 = new Card("Hearts","10");
//			Card card4 = new Card("Diamonds","3");
//			Card card5 = new Card("Spades","3");
//			
//			//Mini Deck of 5 cards that makes a poker hand
//			ArrayList<Card> miniDeck = new ArrayList<Card>();
//			miniDeck.add(card1);
//			miniDeck.add(card2);
//			miniDeck.add(card3);
//			miniDeck.add(card4);
//			miniDeck.add(card5);
//			
//			//Poker Hand
//			
//			PockerHand myHand = new PockerHand(miniDeck);
//			System.out.println(myHand.isPair());
//			System.out.println(myHand.isTwoPair());
			
	
	}
			
			/**
			 * Converts a string to an object
			 * @param givenHand
			 * @return
			 */
			private static ArrayList<Card> convertStringToObject (String givenHand){
				//Implementation a bit messy, can be improved
				
				String[] cards = givenHand.split(",");
				ArrayList<Card> h1 = new ArrayList<Card>();
				for( String card : cards) {
					if(card.indexOf('S')>=0) {
						String[] tempObj;
						card = card.replaceAll("S", ",Spades");
						tempObj = card.split(",");
						Card c1 = new Card(tempObj[1],tempObj[0]);
						h1.add(c1);
					
					}else if(card.indexOf('C')>=0) {
						String[] tempObj;
						card = card.replaceAll("C", ",Clubs");
						tempObj = card.split(",");
						Card c2 = new Card(tempObj[1],tempObj[0]);
						h1.add(c2);
					
					}else if(card.indexOf('H')>=0) {
						String[] tempObj;
						card = card.replaceAll("H", ",Hearts");
						tempObj = card.split(",");
						Card c3 = new Card(tempObj[1],tempObj[0]);
						h1.add(c3);
					
					}else if(card.indexOf('D')>=0){
						String[] tempObj;
						card = card.replaceAll("D", ",Diamonds");
						tempObj = card.split(",");
						Card c4 = new Card(tempObj[1],tempObj[0]);
						h1.add(c4);
					
					}else {
						System.out.println("Err: Unknown String Format "+card);
						break;
					}	
				}
				return h1;
			}
		}
		
			
			
			

			

