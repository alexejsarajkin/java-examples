package com.ocp.book.oracle.concurrency;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ReentrantLockMain {
    public static void main(String[] args) {
        Lock lock = new ReentrantLock();
        try {
            boolean locked = lock.tryLock(3, TimeUnit.SECONDS);
            if (locked) {
                try {

                } finally {
                    lock.unlock();
                }
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        Lock l1 = new ReentrantLock();
        Lock l2 = new ReentrantLock();
    }
}
