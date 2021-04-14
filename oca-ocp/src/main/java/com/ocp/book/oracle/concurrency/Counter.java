package com.ocp.book.oracle.concurrency;

import java.util.concurrent.atomic.AtomicInteger;

public class Counter {
    private AtomicInteger count = new AtomicInteger();

    public void increment() {
        count.getAndIncrement();
    }

    public int getCount() {
        return count.intValue();
    }
}
