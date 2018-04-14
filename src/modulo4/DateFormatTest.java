package modulo4;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.time.temporal.TemporalAccessor;

public class DateFormatTest {

  public static void main(String[] args) {
    LocalTime time = LocalTime
        .parse("10:10 AM", DateTimeFormatter.ofLocalizedTime(FormatStyle.SHORT));
    System.out.println(LocalDateTime.now().format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM)));
    LocalDateTime dateTime = LocalDateTime
        .parse("11/06/2016 10:10:00 AM", DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM));
    DateTimeFormatter formatter = DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL);
    TemporalAccessor ta = formatter.parse("sábado 11 de junio de 2016");

  }
}
