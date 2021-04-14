package com.ocp.book.oracle.streems;

import java.util.Optional;
import java.util.stream.Stream;

public class SensorMain {
    public static void main(String[] args) {
        Sensor s = new Sensor();
        Stream<String> sensorStream = Stream.generate(() -> s.next());
        Optional<String> result = sensorStream
                .filter(e -> e.equals("down"))
                .findFirst();
        System.out.println(result.orElse("null"));

    }
}
