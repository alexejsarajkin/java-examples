package com.ocp.book.oracle.collections;

import java.util.ArrayList;
import java.util.List;

public class TestLegacy {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(13);
        list.add(110);

        add(list);

        for (Integer i : list)
            System.out.println(i);
    }

    private static void add(List list) {
        list.add(new String("23"));
    }
}
