package com.ocp.host.igor.stage1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LexicographicalOrder {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("10");
        list.add("1");
        list.add("2");
        list.add(" 3");
        list.add("a");
        list.add("B");
        Collections.sort(list);
        System.out.println(list);
    }
}
