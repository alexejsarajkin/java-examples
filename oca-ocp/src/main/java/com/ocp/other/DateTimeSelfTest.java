package com.ocp.other;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;

public class DateTimeSelfTest {
    public static void main(String[] args) {
//		ZonedDateTime zd = ZonedDateTime.parse("2020-05-04T08:05:00");
//		System.out.println(zd.getMonth() + " " + zd.getDayOfMonth());

//		LocalTime t1 = LocalTime.of(9, 0);
//		LocalTime t2 = LocalTime.of(10, 5);
//		System.out.println(t1.plus(65, ChronoUnit.MINUTES));
//		System.out.println(t1.plusMinutes(65));
//		System.out.println(t1.plus(Duration.ofMinutes(65)));

//		LocalDate d1 = LocalDate.of(2018, 1, 1);
//		LocalDate d2 = LocalDate.of(2018, 6, 15);
//		Period r = Period.between(d1, d2);
//		System.out.println(r.getMonths() + " " + r.getDays());

//		ZonedDateTime nowZdt = ZonedDateTime.of(LocalDateTime.now(), ZoneId.of("US/Pacific"));
//		System.out.println(nowZdt.withZoneSameInstant(ZoneId.of("Europe/Berlin")));
//		System.out.println(ZonedDateTime.ofInstant(nowZdt.toInstant(), ZoneId.of("Europe/Berlin")));

        LocalDateTime now = LocalDateTime.of(2017, 10, 27, 14, 22, 54, 0);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd hh:mm:ss");
        DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        System.out.println(now.format(formatter));
        System.out.println(now.format(formatter1));

        LocalDate d1 = LocalDate.of(2017, Month.NOVEMBER, 28);
        System.out.println(LocalDate.ofEpochDay(d1.plusDays(27).toEpochDay()));
    }
}
