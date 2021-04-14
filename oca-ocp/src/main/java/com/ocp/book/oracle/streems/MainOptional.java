package com.ocp.book.oracle.streems;

import java.util.Optional;

public class MainOptional {
    public static void main(String[] args) {
        Reading reading = new Reading(2017, 1, 15, 406.14);
        Optional<Reading> optionalReading = Optional.of(reading);
        optionalReading.ifPresent(System.out::println);

        Reading readingNull = null;
        Optional<Reading> optionalReadingNull = Optional.ofNullable(readingNull);
        optionalReadingNull.ifPresent(System.out::println);
        Reading readingOrElse = optionalReadingNull.orElse(reading);
    }
}
