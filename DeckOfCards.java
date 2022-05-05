package com.bridgelabz.day11and12;

public class DeckOfCards {
	public static void main(String[] args) {
		String[] SUITS = {"Clubs", "Diamonds", "Hearts", "Spades"};

		String[] RANKS = {"2", "3", "4", "5", "6", "7", "8", "9", "10",
				"Jack", "Queen", "King", "Ace"};

		int num = SUITS.length * RANKS.length;

		String[] deck = new String[num];
		for (int i = 0; i < RANKS.length; i++) {
			for (int j = 0; j < SUITS.length; j++) {
				deck[SUITS.length*i + j] = RANKS[i] + " of " + SUITS[j];
			}
		}

		for (int i = 0; i < num; i++) {
			int r = i + (int) (Math.random() * (num-i));
			String temp = deck[r];
			deck[r] = deck[i];
			deck[i] = temp;
		}

		for(int j=0; j<4;j++){
			System.out.println("Player number : "+ (j+1));
			int k =9*j;
			for (int i = k; i < 36; i++) {
				System.out.println(deck[i]);
				if(i==8 || i==17 || i==26){
					break;
				}
			}
		}
	}
}




