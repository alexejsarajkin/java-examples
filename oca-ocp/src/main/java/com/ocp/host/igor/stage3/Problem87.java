package com.ocp.host.igor.stage3;

import java.util.Arrays;
import java.util.List;

public class Problem87 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(13, 6, 62);

//		System.out.println(
//				list.stream()
//						.min(Comparator.comparing(x -> x)).get()
//		);

        List<Integer> list1 = Arrays.asList(13, 6, 62);
        System.out.println(
                list1.stream()
                        .min(
                                (e1, e2) -> {
                                    int min = Integer.min(e1, e2);
                                    System.out.println(min);
                                    return min;
                                }
                        )
                        .get()
        );
    }
}
