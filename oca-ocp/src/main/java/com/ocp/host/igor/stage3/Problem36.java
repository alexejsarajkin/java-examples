package com.ocp.host.igor.stage3;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.temporal.ChronoUnit;

public class Problem36 {
    public static void main(String[] args) {
        ZonedDateTime departed = ZonedDateTime.of(1991, 4, 1, 19, 0, 0, 0, ZoneId.of("UTC+3"));
        ZonedDateTime arrived = ZonedDateTime.of(1991, 4, 2, 9, 0, 0, 0, ZoneId.of("UTC+9"));
        long hrs = ChronoUnit.HOURS.between(departed, arrived); // line n1
        System.out.println("Flight time was " + hrs + " hours");
    }
}
