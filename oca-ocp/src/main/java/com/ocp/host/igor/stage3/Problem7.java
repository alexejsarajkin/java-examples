package com.ocp.host.igor.stage3;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Problem7 {
    public static void main(String[] args) {
        List<OS> list = Arrays.asList(
                new OS("Windows "),
                new OS("Solaris "),
                new OS("Linux ")
        );
        Stream<OS> creek = list.stream();
        creek.map(a -> a.name).forEach(System.out::print);
    }
}


class OS {
    String name;

    OS(String name) {
        this.name = name;
    }
}
