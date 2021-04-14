package com.ocp.host.igor.stage3;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Problem45 {
    public static void main(String[] args) {

        Map<Integer, String> sourceMap = new HashMap<>();
        sourceMap.put(37, "Ms.Piggy ");
        sourceMap.put(8, "Gonzo ");
        sourceMap.put(4, "Rowlf ");
        sourceMap.put(12, "Fozzie ");
        sourceMap.put(82, "Kermit ");

        Map<Integer, String> finalMap = new TreeMap<Integer, String>(
                new Comparator<Integer>() {
                    @Override
                    public int compare(Integer obj1, Integer obj2) {
                        return obj2.compareTo(obj1);
                    }
                }
        );

        finalMap.putAll(sourceMap);
        for (Map.Entry<Integer, String> entry : finalMap.entrySet()) {
            System.out.print(entry.getValue());
        }

        finalMap.entrySet()
                .stream()
                .map(Map.Entry::getValue)
                .forEach(System.out::print);
    }
}