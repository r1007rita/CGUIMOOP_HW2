import java.util.ArrayList;

import java.util.HashMap;
import java.util.Scanner;
/*
 * ID: B0444103
 * Name: ±iµú¯ø
 */
public class HW2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("input N(deck of cards):");
		String testn= sc.nextLine(); 
        
		int nDeck=Integer.parseInt(testn);
		Deck deck=new Deck(nDeck);
		
		deck.printDeck();
		
		if(isAllCardsCorrect(deck.getAllCards(),nDeck)){
			System.out.println("Well done!");
		}else{
			System.out.println("Error, please check your sourse code");
		}
	}
	/*
	 * This method is used for checking your result, not a part of your HW2
	 */
	private static boolean isAllCardsCorrect(ArrayList<Card> allCards,int nDeck){
		 
		boolean isCorrect=true;;
		HashMap <String,Integer> checkHash=new HashMap<String,Integer>();
		for(Card card:allCards){
			int suit= card.getSuit();
			int rank = card.getRank();
			if(suit>4||suit<1||rank>13||rank<1){
				isCorrect=false;
				break;
			}
			if(checkHash.containsKey(suit+","+rank)){
				checkHash.put(suit+","+rank, 
						checkHash.get(suit+","+rank)+1);
			}else{
				checkHash.put(suit+","+rank, 1);
			}

		}
		if(checkHash.keySet().size()==52){
			for(int value:checkHash.values()){
				if(value!=nDeck){
					isCorrect=false;
					break;
				}
			}
		}else{
			isCorrect=false;
		}
		return isCorrect;
	}

}

class Deck{
	private ArrayList<Card> cards;
	
	public Deck(int nDeck){
		cards=new ArrayList<Card>();
		Scanner card = new Scanner(System.in);
		int aaa = card.nextInt();
		for(int x = 1;x < 4;x++){
			for(int y = 1;y < 13;y++){
				for(int a = 1;a <aaa ;a++){
					
				}
			}
		}
	}	
	
	public void printDeck(){
		//Hint: print all items in ArrayList<Card> cards, 
		//please implement and reuse printCard method in Card class

	}
	public ArrayList<Card> getAllCards(){
		return cards;
	}
}

class Card{
	private int suit; 
	private int rank; 
	public Card(int s,int r){
		suit=s;
		rank=r;
		for ( s = 1;s < 4; s++){
			for (r = 1; r < 13;r++){
				
			}
		}
	}	
	
	public void printCard(){
		System.out.println(suit+","+rank);
	}
	public int getSuit(){
		return suit;
	}
	public int getRank(){
		return rank;
	}
	
}
