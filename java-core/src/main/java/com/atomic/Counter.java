package com.atomic;

import java.util.concurrent.atomic.AtomicInteger;

public class Counter {
    AtomicInteger count = new AtomicInteger();

    public void increment() {
        count.incrementAndGet();
    }

//  public int count;
//
//  public void increment(){
//    count ++; // Read + Increment + Write
//  }
}