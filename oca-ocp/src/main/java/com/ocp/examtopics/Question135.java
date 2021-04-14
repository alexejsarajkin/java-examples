package com.ocp.examtopics;

public class Question135 {
}

//class Vehicle135 {
//    int id;
//
//    public void start() {
//        public class Engine {
//            int eNo = id;
//        }
//    }
//}

class Computer {
    private Card card = new SoundCard();

    private abstract class Card {
    }

    private class SoundCard extends Card {
    }
}

//class Block {
//    int bno;
//
//    static class Counter {
//        int locator;
//
//        Counter() {
//            locator = bno;
//        }
//    }
//}

class Product135 {
    interface Movable {
        void move();
    }

    Movable m = new Movable() {
        @Override
        public void move() {

        }
    };
}
