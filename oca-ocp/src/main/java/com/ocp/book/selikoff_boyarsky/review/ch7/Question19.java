package com.ocp.book.selikoff_boyarsky.review.ch7;

public class Question19 {
    private Question19() {
        super();
    }

    private static Question19 instance;

    public static synchronized Question19 getInstance() {
        if (instance == null) instance = new Question19();
        return instance;
    }

    private int tickets;

    public int getTicketCount() {
        return tickets;
    }

    public void makeTicketsAvailable(int value) {
        tickets += value;
    }

    public void sellTickets(int value) {
        synchronized (this) {
            tickets -= value;
        }
    }
}

