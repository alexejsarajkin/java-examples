package com.ocp.book.oracle.lambda;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.function.IntSupplier;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

public class MainTest {
    public static void main(String[] args) {
        Supplier<String> userSupplier = () -> {
            Map<String, String> env = System.getenv();
            return env.get("USER");
        };
        System.out.println(userSupplier.get());

        Random random = new Random();
        IntSupplier randomIntSupplier = () -> random.nextInt(50);
        int myRandom = randomIntSupplier.getAsInt();
        System.out.println(myRandom);

        List<String> dogNames = Arrays.asList("boi", "clover", "zooey");
        dogNames.forEach(System.out::println);

        UnaryOperator<Double> log2 = (v) -> Math.log(v) / Math.log(2);
        System.out.println(log2.apply(8.0));

//		Predicate<String> p = (s) -> System.out.println(s);
//		Consumer<String> c = (s) -> System.out.println(s);
//		Supplier<String> s = (s) -> System.out.println(s);
//		Function<String> f = (s) -> System.out.println(s);

    }
}
