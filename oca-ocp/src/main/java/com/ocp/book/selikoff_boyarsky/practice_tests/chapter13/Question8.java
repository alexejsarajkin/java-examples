package com.ocp.book.selikoff_boyarsky.practice_tests.chapter13;

import java.util.Iterator;
import java.util.LinkedList;

public class Question8 {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("Grapes of Wrath");
        list.add("1984");

        list.forEach(System.out::println);

        Iterator it = list.iterator();
        while (it.hasNext())
            System.out.println(it.next());
    }
}
