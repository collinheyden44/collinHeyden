package arrays;

public class DeckOfCards {

	public static void main(String[] args) {
		String[] SUITS = {"Clubs", "Diamonds", "Hearts", "Spades"};

	        String[] RANKS = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};

	        int n = SUITS.length * RANKS.length;
	        String[] deck = new String[n];
	        for (int i = 0; i < RANKS.length; i++) {
	            for (int j = 0; j < SUITS.length; j++) {
	                deck[SUITS.length*i + j] = RANKS[i] + " of " + SUITS[j];
	            }
	        }
	        
        	System.out.println("\n" + "Original Deck:");
	        for(int i = 0; i < n; i++) {
	        	System.out.println(deck[i]);
	        }
	        
	        for (int i = 0; i < n; i++) {
	            int r = i + (int) (Math.random() * (n-i));
	            String temp = deck[r];
	            deck[r] = deck[i];
	            deck[i] = temp;
	        }
	        
	        System.out.println("\n" + "Shuffled Deck:");
	        for (int i = 0; i < n; i++) {
	            System.out.println(deck[i]);
	        }

	}

}
