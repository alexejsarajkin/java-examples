package com.concurrency;

public class Deadlock2 {

    static class Friend {
        private final String name;

        public Friend(String name) {
            this.name = name;
        }

        public String getName() {
            return this.name;
        }

        public synchronized void bow(Friend bower) {
            System.out.format("%s: %s" + " has bowed to me!%n", this.name, bower.getName());
            bower.bowBack(this);
        }

        public synchronized void bowBack(Friend bower) {
            System.out.format("%s: %s" + " has bowed back to me!%n", this.name, bower.getName());
        }
    }

    public static void main(String[] args) {
        final Friend alphonse = new Friend("Alphonse");
        final Friend gaston = new Friend("Gaston");

        new Thread(() -> alphonse.bow(gaston)).start();

        new Thread(() -> gaston.bow(alphonse)).start();
    }
}


//        Thread 1: alphonse instance gets locked from alphonse.bow(gaston); which prints a line and then calls gaston.bowBack()
//                (but gaston is locked from Thread 2 due to synchronized bow() instance called on it below)
//
//        Thread 2: gaston instance gets locked from gaston.bow(alphonse); which prints a line and then calls alphonse.bowBack()
//                (but alphonse is locked from Thread 1 due to synchronized bow() instance called on it)
//
//        So they're both waiting for the release and cannot exit bow() method, hence the com.udemy.javalesson.com.concurrency.Deadlock



