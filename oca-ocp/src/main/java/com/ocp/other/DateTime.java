package com.ocp.other;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjusters;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Locale;
import java.util.Set;

public class DateTime {
    public static void main(String[] args) {
//		LocalDate nowDate = LocalDate.now();
//		LocalTime nowTime = LocalTime.now();
//		LocalDateTime nowDateTime = LocalDateTime.of(nowDate, nowTime);
//		System.out.println(nowDateTime);

//		LocalDate eclipseDate1 = LocalDate.of(2017,8,21);
//		LocalDate eclipseDate2 = LocalDate.parse("2017-08-21");
//		System.out.println(eclipseDate1);
//		System.out.println(eclipseDate2);

//		LocalTime begins = LocalTime.of(9,6,43);
//		LocalTime totality = LocalTime.parse("10:19:36");
//		System.out.println(begins);
//		System.out.println(totality);

        String eclipseDateTime = "2017-08-21 10:19";
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
        LocalDateTime eclipseDay = LocalDateTime.parse(eclipseDateTime, formatter);
        System.out.println(eclipseDay);
        System.out.println(eclipseDay.format(DateTimeFormatter.ofPattern("dd, MM, yy hh, mm")));

        System.out.println(eclipseDay.plusHours(2));
        System.out.println(eclipseDay.plusDays(3));
        System.out.println(eclipseDay.getDayOfWeek());

        ZonedDateTime zTotalityDateTime = ZonedDateTime.of(eclipseDay, ZoneId.of("US/Pacific"));
        System.out.println(zTotalityDateTime);
        ZonedDateTime zTotalityDateTime1 = ZonedDateTime.of(eclipseDay, ZoneId.of("GMT-7"));
        System.out.println(zTotalityDateTime1);

        Set<String> availableZoneIds = ZoneId.getAvailableZoneIds();
        ArrayList<String> zoneList = new ArrayList<>(availableZoneIds);
        Collections.sort(zoneList);
        for (String zoneId : zoneList) {
            if (zoneId.contains("US")) {
                System.out.println(zoneId);
            }
        }

        ZoneId pacific = ZoneId.of("US/Pacific");
        System.out.println(pacific.getRules().isDaylightSavings(zTotalityDateTime.toInstant()));

        System.out.println(zTotalityDateTime.with(TemporalAdjusters.next(DayOfWeek.THURSDAY)));
        System.out.println(zTotalityDateTime.withYear(3030));

        ZonedDateTime totalityAustin = ZonedDateTime.of(2024, 4, 8, 13, 35, 56, 0, ZoneId.of("US/Central"));
        System.out.println(totalityAustin);

        Period period = Period.ofMonths(1);
        System.out.println(period);
        ZonedDateTime reminder = totalityAustin.minus(period);
        System.out.println(reminder);
        System.out.println(reminder.toLocalDateTime());
        System.out.println(reminder.withZoneSameInstant(ZoneId.of("US/Pacific")));

        LocalTime begins = LocalTime.of(12, 17, 32);
        LocalTime totality = LocalTime.of(13, 35, 56);
        System.out.println(begins);
        System.out.println(totality);

        long betweenMins = ChronoUnit.MINUTES.between(begins, totality);
        System.out.println(betweenMins);

        Duration betweenDuration = Duration.ofMinutes(betweenMins);
        System.out.println(betweenDuration);
        System.out.println(begins.plus(betweenDuration));

        Instant nowInstant = Instant.now();
        Instant totalityInstant = totalityAustin.toInstant();

        long minsBetween = ChronoUnit.MINUTES.between(nowInstant, totalityInstant);
        Duration durationBetweenInstants = Duration.ofMinutes(minsBetween);
        System.out.println(minsBetween);
        System.out.println(durationBetweenInstants);
        System.out.println(Instant.now().getEpochSecond());

        System.out.println(totalityAustin.minus(Period.ofDays(3)));
        System.out.println(totalityAustin.minus(Period.ofDays(3)).getDayOfWeek());

        ZonedDateTime localParis = totalityAustin.withZoneSameInstant(ZoneId.of("Europe/Paris"));
        System.out.println(localParis);
        System.out.println(totalityAustin.plusHours(2));
        System.out.println(localParis.plusHours(2));

        System.out.println(totalityAustin.toLocalDate().isLeapYear());
        System.out.println(Year.of(totalityAustin.getYear()).isLeap());

        System.out.println(totalityAustin.format(DateTimeFormatter.ofPattern("dd/MM/yyyy hh:mm")));
        System.out.println(totalityAustin.format(
                DateTimeFormatter.ofLocalizedDateTime(
                        FormatStyle.SHORT
                ).withLocale(Locale.UK)));

        Locale myLocale = Locale.getDefault();
        System.out.println(myLocale);
        System.out.println(myLocale.getDisplayCountry());
        System.out.println(myLocale.getDisplayLanguage());

        System.out.println(totalityAustin.format(
                DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM)
                        .withLocale(Locale.getDefault())));

        System.out.println(totalityAustin.format(
                DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM)
                        .withLocale(new Locale("it", "IT"))));

        System.out.println(totalityAustin.format(
                DateTimeFormatter.ofLocalizedDateTime(FormatStyle.LONG)
                        .withLocale(new Locale("ja"))));

    }
}
