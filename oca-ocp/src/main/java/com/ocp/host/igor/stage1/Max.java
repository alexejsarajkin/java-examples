package com.ocp.host.igor.stage1;

import java.util.*;

public class Max {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3);

        Optional<Integer> maxValue = list.stream().max(
                new Comparator<Integer>() {
                    @Override
                    public int compare(Integer o1, Integer o2) {
                        return o1 - o2;
                    }
                });

        System.out.println(maxValue.get());

        OptionalInt maxValue2 = list.stream().mapToInt(x -> x).max();

        System.out.println(maxValue2.getAsInt());

        Optional<Integer> maxValue3 = list.stream().max(Comparator.naturalOrder());

    }
}
