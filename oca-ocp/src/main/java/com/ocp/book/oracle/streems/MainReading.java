package com.ocp.book.oracle.streems;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.stream.Stream;

public class MainReading {
    public static void main(String[] args) {
        List<Reading> readings = Arrays.asList(
                new Reading(2017, 1, 1, 405.91),
                new Reading(2017, 1, 8, 405.98),
                new Reading(2017, 1, 15, 406.14),
                new Reading(2017, 1, 22, 406.48),
                new Reading(2017, 1, 29, 406.20),
                new Reading(2017, 2, 5, 407.12),
                new Reading(2017, 2, 12, 406.03)
        );

        OptionalDouble average = readings.stream()
                .mapToDouble(r -> r.value)
                .filter(v -> v >= 406.0 && v < 407.00)
                .average();

        System.out.println(average.isPresent() ? average.getAsDouble() : "Empty");

        OptionalDouble max = readings.stream()
                .mapToDouble(r -> r.value)
                .max();

        System.out.println(max.isPresent() ? max.getAsDouble() : "Empty");

        double sum = readings.stream()
                .mapToDouble(r -> r.value)
                .sum();

        System.out.println(sum);


        OptionalDouble ownSum = readings.stream()
                .mapToDouble(r -> r.value)
                .reduce((v1, v2) -> v1 + v2);

        System.out.println(ownSum.isPresent() ? ownSum.getAsDouble() : "Empty");

        double ownIdentitySum = readings.stream()
                .mapToDouble(r -> r.value)
                .reduce(0.0, (v1, v2) -> v1 + v2);

        System.out.println(ownIdentitySum);

        Stream<Double> doubleStream = Stream.of(1.0, 2.0, 3.0, 4.0);
        Optional<Double> first = doubleStream.findFirst();
        System.out.println(first.isPresent() ? first.get() : "Empty");
        first.ifPresent(e -> System.out.println(e));
    }
}
