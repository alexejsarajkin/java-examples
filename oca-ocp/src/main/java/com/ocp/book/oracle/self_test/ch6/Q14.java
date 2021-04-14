package com.ocp.book.oracle.self_test.ch6;

import java.util.SortedMap;
import java.util.TreeMap;

public class Q14 {
    public static void main(String[] args) {
        TreeMap<String, String> myMap = new TreeMap<>();
        myMap.put("a", "apple");
        myMap.put("d", "date");
        myMap.put("f", "fig");
        myMap.put("p", "pear");
        System.out.println(myMap.higherKey("f"));
        System.out.println(myMap.ceilingKey("f"));
        System.out.println(myMap.floorKey("f"));

        SortedMap<String, String> sub = new TreeMap<>();
        sub = myMap.tailMap("f");
        System.out.println(sub.firstKey());
    }
}
