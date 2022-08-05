package chapter_3.datetime;

import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import static java.time.temporal.ChronoField.SECOND_OF_MINUTE;

public class TimeStampCompare {
    public static void main(String[] args) {
        LocalDateTime current = LocalDateTime.now();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        LocalDateTime currentDateTime = LocalDateTime.parse("2022-07-19 15:25:00", formatter);
        LocalDateTime big = LocalDateTime.parse("2022-07-19 15:25:59", formatter);
        Timestamp timestamp = Timestamp.valueOf(currentDateTime);
        Timestamp bigTimestamp = Timestamp.valueOf(big);
        System.out.println(bigTimestamp);
        LocalDateTime mytime = LocalDateTime.of(current.getYear(), current.getMonth(), current.getDayOfMonth(), current.getHour(), current.getMinute());
        System.out.println(Timestamp.valueOf(mytime));
    }
}
