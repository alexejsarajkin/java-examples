package com.ocp.book.oracle.concurrency;

public class IncrementThread extends Thread {
    private Counter counter;

    public IncrementThread(Counter counter) {
        this.counter = counter;
    }

    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            counter.increment();
        }
    }

    public static void main(String[] args) throws InterruptedException {
        Counter counter = new Counter();
        IncrementThread incrementThread1 = new IncrementThread(counter);
        IncrementThread incrementThread2 = new IncrementThread(counter);

        incrementThread1.start();
        incrementThread2.start();

        incrementThread1.join();
        incrementThread2.join();

        System.out.println(counter.getCount());
    }
}
