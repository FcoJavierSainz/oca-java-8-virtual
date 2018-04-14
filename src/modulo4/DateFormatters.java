package modulo4;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class DateFormatters {

  public static void main(String[] args) {
    DateTimeFormatter formatter1 =
        DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM);
    DateTimeFormatter formatter2 =
        DateTimeFormatter.ofLocalizedTime(FormatStyle.FULL);
    DateTimeFormatter formatter3 =
        DateTimeFormatter.ofLocalizedDateTime(FormatStyle.LONG);
    DateTimeFormatter formatter4 =
        DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT,
            FormatStyle.SHORT);

    DateTimeFormatter formatter5 = DateTimeFormatter.ISO_DATE;

    DateTimeFormatter formatter6= DateTimeFormatter.ofPattern("yyyy MM dd");

    LocalDate date = LocalDate.now();
    System.out.println(date.format(formatter1));

    LocalTime time = LocalTime.now();
    System.out.println(time.format(formatter2));

    LocalDateTime now = LocalDateTime.now();
    System.out.println(now.format(formatter3));


  }
}
