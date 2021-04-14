package com.oca;

import java.util.ArrayList;
import java.util.List;

public class AL {
    public static void main(String[] args) {
        List<Long> longs = new ArrayList<>();
        longs.add(new Long(1));
        longs.add(2L);
        longs.add(new Long("3"));
        longs.add(4L);
        longs.remove(2);
        System.out.println(longs);
    }
}
