package com.ocp.book.oracle.collections;

import java.util.*;

public class CollectionsTest implements Comparable {

    public static void main(String[] args) {
        List<Integer> l = new ArrayList<>();
        l.add(3);
        l.add(7);
        l.add(1);
        Collections.sort(l);
        System.out.println(l);

        List l1 = new ArrayList();
        Set s = new HashSet();
    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }
}
