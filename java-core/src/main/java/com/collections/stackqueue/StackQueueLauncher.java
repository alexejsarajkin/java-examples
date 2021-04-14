package com.collections.stackqueue;

import com.collections.collectionclass.Card;
import com.collections.collectionclass.CardComparator;

import java.util.*;

public class StackQueueLauncher {

    public static void main(String[] args) {
//        passengerProcessing();

//        Queue<Card> queue = new PriorityQueue<>();
        Queue<Card> queue = new PriorityQueue<>(52, new CardComparator()); // С компаратором
        for (Card.Face face : Card.Face.values()) {
            for (Card.Suit suit : Card.Suit.values()) {
                queue.offer(new Card(suit, face));
            }
        }

//        System.out.println("Queue -------------- ");
//        System.out.println("Deck size is " + queue.size());
//        for (int i = 0; i < 10; i++){
//            System.out.println(queue.poll());
//        }
//
//        System.out.println("Deck size is " + queue.size());
//        System.out.println(queue);
//
//        Iterator<Card> iterator = queue.iterator();
//        while (iterator.hasNext()) {
//            System.out.println(iterator.next());
//        }

        System.out.println("Deque -------------- ");
        Deque<Card> cards = new ArrayDeque<>();
        for (int i = 0; i < 10; i++) {
            cards.offerLast(queue.poll());
        }

        for (int i = 0; i < 10; i++) {
            System.out.println(cards.pollLast());
        }
    }

    private static void passengerProcessing() {
        Stack<Passenger> bus = new Stack<>();
        Passenger passenger = new Passenger("Katerina", "Ivanova");
        bus.push(new Passenger("Alex", "Vasko"));
        bus.push(new Passenger("Viktor", "Mikhailov"));
        bus.push(new Passenger("Dmitrii", "Petrov"));
        bus.push(passenger);
        bus.push(new Passenger("Ivan", "Ivanov"));

        System.out.println("Passenger found at position " + bus.search(passenger));

        System.out.println("Last entered passenger is " + bus.peek());

        while (!bus.empty()) {
            System.out.println("Passenger is " + bus.pop());
        }

    }

    private static class Passenger {

        private static int number = 1;
        private String name;
        private String surname;

        public Passenger(String name, String surname) {
            number++;
            this.name = name;
            this.surname = surname;
        }

        public int getNumber() {
            return number;
        }

        public String getName() {
            return name;
        }

        public String getSurname() {
            return surname;
        }

        @Override
        public String toString() {
            return "Passenger " + name + " " + surname;
        }
    }
}
