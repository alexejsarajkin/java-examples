package com.ocp.book.selikoff_boyarsky.review.ch3;

import java.util.HashMap;
import java.util.Map;

public class Question25 {
    public static void main(String[] args) {
        Map<Integer, Integer> map = new HashMap<>();
        map.put(1, 10);
        map.put(2, 20);
        map.put(3, null);
        map.merge(1, 3, (a, b) -> a + b);
        map.merge(3, 3, (a, b) -> a + b);
    }
}
