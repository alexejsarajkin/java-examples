package com.ocp.book.oracle.concurrency;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

public class CyclicBarrierMain {
    List<String> result = new ArrayList<>();
    static String[] dogs1 = {"boi", "clover", "charis"};
    static String[] dogs2 = {"aiko", "zooey", "biscuit"};
    final CyclicBarrier barrier;

    class ProcessDogs implements Runnable {
        String dogs[];

        public ProcessDogs(String[] dogs) {
            this.dogs = dogs;
        }

        @Override
        public void run() {
            for (int i = 0; i < dogs.length; i++) {
                String dogName = dogs[i];
                String newDogName = dogName.substring(0, 1).toUpperCase() + dogName.substring(1);
                dogs[i] = newDogName;
            }

            try {
                barrier.await();
            } catch (InterruptedException | BrokenBarrierException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + " is done!");
        }
    }

    public CyclicBarrierMain() {
        barrier = new CyclicBarrier(2, () -> {
            for (int i = 0; i < dogs1.length; i++) {
                result.add(dogs1[i]);
            }
            for (int i = 0; i < dogs2.length; i++) {
                result.add(dogs2[i]);
            }
            System.out.println(Thread.currentThread().getName() + " Result " + result);
        });

        Thread t1 = new Thread(new ProcessDogs(dogs1));
        Thread t2 = new Thread(new ProcessDogs(dogs2));

        t1.start();
        t2.start();
        System.out.println(Thread.currentThread().getName() + " thread is done");
    }

    public static void main(String[] args) {
        new CyclicBarrierMain();
        System.out.println(Runtime.getRuntime().availableProcessors());
    }

}
