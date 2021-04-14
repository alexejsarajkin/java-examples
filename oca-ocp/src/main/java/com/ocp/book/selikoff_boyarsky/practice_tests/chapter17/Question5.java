package com.ocp.book.selikoff_boyarsky.practice_tests.chapter17;

import java.time.*;

public class Question5 {
    public static void main(String[] args) {
        LocalDate localDate = LocalDate.of(2017, 3, 12);
        LocalTime localTime = LocalTime.of(1, 0);
        ZoneId zone = ZoneId.of("America/New_York");
        ZonedDateTime z = ZonedDateTime.of(localDate, localTime, zone);
        Duration duration = Duration.ofHours(3);
        ZonedDateTime later = z.plus(duration);
        System.out.println(later.getHour());
    }
}
