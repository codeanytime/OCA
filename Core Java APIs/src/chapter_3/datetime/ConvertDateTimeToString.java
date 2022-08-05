package chapter_3.datetime;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

//Simple date formatter is old use
//new is DateTimeFormatter
//hh: hour, mm: minute, M: month, d: day, y: year
public class ConvertDateTimeToString {
    public static void main(String[] args) {
        LocalDateTime date = LocalDateTime.of(2022, 6, 19, 9, 46);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("hh:mm dd-MM-yyyy");
        date.format(formatter);
        System.out.println(date.format(formatter));
    }
}
