package com.ocp.book.selikoff_boyarsky.practice_tests.chapter13;

import java.util.ArrayDeque;

public class Question11 {
    public static void main(String[] args) {
        ArrayDeque<Integer> d = new ArrayDeque<>();
        d.offer(18);
        d.offer(5);
        d.push(13);
        System.out.println(d.poll() + " " + d.poll());
    }
}
