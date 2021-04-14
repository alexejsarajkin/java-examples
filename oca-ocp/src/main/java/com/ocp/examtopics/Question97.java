package com.ocp.examtopics;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class Question97 {
    public static void main(String[] args) {
        ZoneId zoneId = ZoneId.of("America/New_York");
        ZonedDateTime dt = ZonedDateTime.of(
                LocalDate.of(2015, 3, 8),
                LocalTime.of(1, 0),
                zoneId);

        ZonedDateTime dt2 = dt.plusHours(2);
        System.out.println(DateTimeFormatter.ofPattern("H:mm").format(dt2));
        System.out.println(ChronoUnit.HOURS.between(dt, dt2));
    }
}

// 4:00 difference: 2
