package com.ocp.host.igor.stage3;

public class Problem94 {
    public static void main(String[] args) {
        Printable<Integer> publisher = x -> System.out.println("Printing " + x + " copies.");
        publisher.offsetPrinting(100000);
        publisher.printOnDemand(2);

//		Printable publisher = (Integer x) -> System.out.println(x);
//		publisher.offsetPrinting(100000);
//		Printable.printOnDemand(2);
    }
}

interface Printable<Integer> {
    public default void printOnDemand(Integer copies) {
        System.out.println("Printing on demand.");
    }

    public void offsetPrinting(Integer copies);
}
