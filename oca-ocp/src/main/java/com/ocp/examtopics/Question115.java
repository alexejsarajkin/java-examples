package com.ocp.examtopics;

import java.util.ArrayDeque;
import java.util.Deque;

public class Question115 {
    public static void main(String[] args) {
        Deque<String> deque = new ArrayDeque<>();
        deque.add("Susan");
        deque.add("Allen");
        deque.add("David");
        System.out.println(deque.pop());
        System.out.println(deque.remove());
        System.out.println(deque);
    }
}

// Susan Allen [David]
