package com.ocp.book.selikoff_boyarsky.practice_tests.chapter13;

import java.util.ArrayList;
import java.util.List;

public class Question13 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Monday");
//         list.add(String::new);
        list.add("Tuesday");
        list.remove(0);
        System.out.println(list.get(0));
    }
}
