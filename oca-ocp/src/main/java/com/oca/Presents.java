package com.oca;

import java.util.ArrayList;
import java.util.List;

public class Presents {
    public static void main(String[] args) {
        List<Integer> myInts = new ArrayList<>();
        myInts.add(new Integer("1"));
        myInts.add(2);
        myInts.add(new Integer(3));
        System.out.println(myInts.indexOf(2));
    }
}
