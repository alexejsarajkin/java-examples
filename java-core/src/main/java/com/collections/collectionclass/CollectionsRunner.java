package com.collections.collectionclass;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionsRunner {

    public static void main(String[] args) {
        List<Card> deckOfCards = new ArrayList<>();

        for (Card.Face face : Card.Face.values()) {
            for (Card.Suit suit : Card.Suit.values()) {
                deckOfCards.add(new Card(suit, face));
            }
        }

        System.out.println("Original deck of cards");

        printOutput((List<Card>) deckOfCards);

        System.out.println("\nCard after shuffle");
        Collections.shuffle(deckOfCards);
        printOutput(deckOfCards);

        System.out.println("\nCard after sorting Collections.reverseOrder()");
        Collections.sort(deckOfCards, Collections.reverseOrder());
        printOutput(deckOfCards);

        System.out.println("\nCard after sorting new CardComparator()");
        Collections.shuffle(deckOfCards);
        Collections.sort(deckOfCards, new CardComparator());
        printOutput(deckOfCards);

        // binarySearch
        Collections.sort(deckOfCards); // Обязательно надо это сделать
        Card card = new Card(Card.Suit.SPADES, Card.Face.Queen);
        int i = Collections.binarySearch(deckOfCards, card); // При поиске постоянно делит лист пополам, так и ищет

        if (i >= 0) {
            System.out.println("Card was found at position " + i);
        } else {
            System.out.println("Card was not found ");
        }


        List<Card> cardList = new ArrayList<>(deckOfCards);
        System.out.println("MIN : " + Collections.min(cardList));
        System.out.println("MAX : " + Collections.max(cardList));
    }

    private static void printOutput(List<Card> deckOfCards) {
        for (int i = 0; i < deckOfCards.size(); i++) {
            System.out.printf("%-20s %s", deckOfCards.get(i), (i + 1) % 4 == 0 ? "\n" : " ");
        }
    }

}

