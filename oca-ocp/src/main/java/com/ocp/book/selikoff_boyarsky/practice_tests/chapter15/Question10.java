package com.ocp.book.selikoff_boyarsky.practice_tests.chapter15;

import java.util.HashMap;
import java.util.Map;

public class Question10 {
}

class MapOfMaps {
    public static void main(String[] args) {
        Map<Integer, Integer> map = new HashMap<>();
        map.put(9, 3);
//        Map<Integer, Integer> result = map.stream().map((k, v) -> (v, k));
//        System.out.println(result.keySet().iterator().next());
    }
}
