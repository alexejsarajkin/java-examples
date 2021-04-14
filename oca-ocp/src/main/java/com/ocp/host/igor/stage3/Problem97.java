package com.ocp.host.igor.stage3;

import java.util.Arrays;
import java.util.List;

public class Problem97 {
    public static void main(String[] args) {
        List<String> archives = Arrays.asList("ZIP", "RAR", "TAR");
        archives.forEach(x -> System.out.print(x + " "));
        String common = archives.stream()
                .filter(x -> x.contains("AR"))
                .reduce((x, y) -> x + y).get();
        System.out.println("\n" + common);
    }
}
