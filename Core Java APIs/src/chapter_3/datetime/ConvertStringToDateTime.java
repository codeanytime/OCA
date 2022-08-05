package chapter_3.datetime;

import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.TimeZone;

//HH: hour 24, hh: hour 12
public class ConvertStringToDateTime {
    public static void main(String[] args) throws ParseException {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm dd-MM-yyyy");
//        DateTimeFormatter dtf = new DateTimeFormatterBuilder()
//                .appendPattern("HH:mm dd-MM-yyyy")
//                .parseDefaulting(ChronoField.HOUR_OF_DAY, 0)
//                .parseDefaulting(ChronoField.MINUTE_OF_HOUR, 0)
//                .parseDefaulting(ChronoField.SECOND_OF_MINUTE, 0)
//                .toFormatter(Locale.JAPAN);
        String dateStr = "13:37 19-06-2022";
        LocalDateTime dateAfterConvert = LocalDateTime.parse(dateStr, formatter);
        System.out.println(dateAfterConvert);

        //use SimpleDateFormat
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("HH:mm dd-MM-yyyy");
        simpleDateFormat.setTimeZone(TimeZone.getDefault());
        System.out.println(simpleDateFormat.parse(dateStr));
        System.out.println(dateAfterConvert.toEpochSecond(ZoneOffset.UTC));

        double x = 39.21;
        float y = 3.2f;
        double z = 30.6;
        double t = x * y /z;
        System.out.println(t);
        String s = "Thanh";
        String $s = new String(s);
        System.out.println(s.equals($s));
        StringBuilder test = new StringBuilder(s);
        System.out.println(test.equals(s));
        String newStr = "test";
        newStr += "1";
        System.out.println(newStr == "test1");
        System.out.println(newStr.hashCode());
        System.out.println("test1".hashCode());

        StringBuilder sb = new StringBuilder("THANH");
        sb.delete(1,1);
        System.out.println(sb);

        System.out.println(System.getProperty("os.name"));

        Timestamp ts=new Timestamp(1657857690);
        Date date=ts;
        System.out.println("TIME" + ts);
        System.out.println("TTTT" + date);
    }

    private void setNumber() {

    }
}
