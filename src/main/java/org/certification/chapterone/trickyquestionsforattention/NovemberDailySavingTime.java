package org.certification.chapterone.trickyquestionsforattention;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/*
Question?
In most of the United States, daylight saving time ends on November 6, 2022 at 02:00 and we repeat that hour.
What is the output of the following?
 */
public class NovemberDailySavingTime {
    public static void main(String[] args) {
        var localDate = LocalDate.of(2022, 10, 6);
        var localTime = LocalTime.of(1, 0);
        var zone = ZoneId.of("America/New_York");
        var z = ZonedDateTime.of(localDate, localTime, zone);
        var offset = z.getOffset();

        for (int i = 0; i < 6; i++)
        z = z.plusHours(1);

        System.out.println(z.getHour() + " "
                + offset.equals(z.getOffset()));
    }
}
