package com.ocp.book.oracle.threads;


public class ShowMain {
    public static void main(String[] args) {
        ShowMain showMain = new ShowMain();
        showMain.go();
    }

    public void go() {
        Thread getSeats1 = new Thread(() -> {
            ticketAgentBooks("1A");
            ticketAgentBooks("1B");
        });

        Thread getSeats2 = new Thread(() -> {
            ticketAgentBooks("1A");
            ticketAgentBooks("1B");
        });

        getSeats1.start();
        getSeats2.start();
    }

    public void ticketAgentBooks(String seat) {
        Show show = Show.getInstance();
        System.out.println(Thread.currentThread().getName() + " : " + show.bookSeat(seat));
    }
}
