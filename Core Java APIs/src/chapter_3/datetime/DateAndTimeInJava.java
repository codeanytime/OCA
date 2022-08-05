package chapter_3.datetime;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Calendar;
import java.util.Locale;


//LocalDate only include date, month, year information.
//LocalTime only include hour, minute, nano information.
//LocalDateTime = LocalDate information + LocalTime information.
//LocalDateTime, LocalDate, LocalTime are immutable.
//Period is very comfortable when calculate time with period.
public class DateAndTimeInJava {
    public static void main(String[] args) {
        LocalDate date = LocalDate.of(1991, Month.SEPTEMBER, 26);
        System.out.println(date);

        LocalTime time = LocalTime.of(15, 42);
        System.out.println(time);

        LocalDateTime dateTime = LocalDateTime.now();
        System.out.println(dateTime);
        dateTime.minusDays(1);
        System.out.println(dateTime.minusDays(1));

        Calendar cal = Calendar.getInstance();
        cal.set(2022, Calendar.OCTOBER, 26);
        System.out.println(cal.getTime());

        System.out.println("Period Test ____________");
        LocalDateTime startDate = LocalDateTime.of(1991, 9, 26, 23, 32);
        LocalDateTime endDate = LocalDateTime.of(2023, 9, 26, 23, 32);
        Period period = Period.of(1, 0, 0);
        periodTest(startDate, endDate, period);

        // Throw exception because LocalTime cannot use period (Class Period use with LocalDateTime and LocalDate)
//        LocalTime timeTest = LocalTime.of(23, 32);
//        System.out.println(timeTest.plus(Period.ofDays(1)));
        System.out.println("LOCALIZE_______________");
        DateTimeFormatter format = DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL).withLocale(Locale.JAPAN);
        System.out.println(format.format(startDate));
    }

    private static void periodTest(LocalDateTime start, LocalDateTime end, Period period) {
        LocalDateTime upTo = start;
        int count = 0;
        while (upTo.isBefore(end)) {
            System.out.println("new Period: " + upTo.getDayOfWeek() + " " + upTo.format(DateTimeFormatter.ISO_LOCAL_DATE));
            upTo = upTo.plus(period);
            count++;
        }
        System.out.println(count);
    }
}
