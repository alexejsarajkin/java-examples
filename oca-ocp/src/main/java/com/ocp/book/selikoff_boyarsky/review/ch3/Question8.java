package com.ocp.book.selikoff_boyarsky.review.ch3;

import java.util.TreeSet;

public class Question8 {
    public static void main(String[] args) {
        TreeSet<String> tree = new TreeSet<String>();
        tree.add("one");
        tree.add("One");
        tree.add("ONE");
        System.out.println(tree.ceiling("On"));
    }
}
