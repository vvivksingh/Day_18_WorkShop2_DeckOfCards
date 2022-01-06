package com.BridgeLabz.WorkShop2.DeckOfCards;

import java.util.ArrayList;
import java.util.Scanner;

public class DeckOfCards {
    public static ArrayList<String> deckCards = new ArrayList<>();
    public static Scanner scanner = new Scanner(System.in);

    public void welcome(){
        System.out.println("Welcome to the Deck of Card DashBoard");
    }
    public void deckOfCard(){
        String[] suits = {"Clubs", "Diamonds", "Hearts", "Spades"};
        String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "King", "Queen", "Ace"};
        int numOfCards = suits.length * ranks.length;
        System.out.println("\nNumber of cards in the deck:" + numOfCards);
        for (int i = 0; i < ranks.length; i++) {
            for (int j = 0; j < suits.length; j++) {
                deckCards.add(ranks[i] + "->" + suits[j]);
            }
        }
        toDisplay(deckCards);
    }

    public static void toDisplay(ArrayList<String> cardsDeck) {
        System.out.println("\nCards in Deck:");
        for (String element : cardsDeck) {
            System.out.println(element);
        }
        System.out.println();
    }
    public void noOfPlayers() {
        System.out.print("\nEnter number of players minimum 2 , maximum 4 : ");
        int player = scanner.nextInt();
        if (player >= 2 && player <= 4) {
            System.out.println("\n" + player + " players will play the game");
        } else {
            System.out.println("Please enter number of players in the Range");
            this.noOfPlayers();
            scanner.close();
        }
    }
    public void seqOfPlayer(int player) {
        System.out.println("\nSequence of cards are below : ");
        for (int i = 1; i <= player; i++) {
            System.out.println("\nPlayer " + i + " Getting card.............");
        }
    }
    public static void shuffleCard() {
        System.out.println("shuffling the cards before Distribution");
        ArrayList<String> temp = new ArrayList<String>();
        while (!deckCards.isEmpty()) {
            int sufCard = (int) (Math.random() * deckCards.size());
            temp.add(deckCards.get(sufCard));
            deckCards.remove(sufCard);
        }
        deckCards = temp;
        toDisplay(deckCards);
    }
}


