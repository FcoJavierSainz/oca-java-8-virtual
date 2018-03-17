import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.time.temporal.TemporalAccessor;

/**
 * Created by JavierSainz on 3/1/16.
 */
public class LocalTimeTest {
    public static void main(String[] args) {
        //plusXxx <- plural
        int worldRecord = 10;
        LocalTime raceStartTime = LocalTime.of(8, 10, 55);
        LocalTime raceEndTime = LocalTime.of(8, 11, 11);
        if (raceStartTime.plusSeconds(worldRecord).isAfter(raceEndTime))
            System.out.println("New world record");
        else
            System.out.println("Try harder");
        //minusXxx <- plural
        LocalTime movieStartTime = LocalTime.parse("21:00:00");
        int commuteMin = 35;
        LocalTime shreyaStartTime = movieStartTime.minusMinutes(commuteMin);
        System.out.println("Start by " + shreyaStartTime + " from office");

        LocalDateTime ldt = LocalDateTime.of(2016, 6, 11, 10, 10, 0);
        ZonedDateTime zdt = ZonedDateTime.of(ldt, ZoneId.of("America/Mexico_City"));
        System.out.println(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.FULL, FormatStyle.MEDIUM).format(ldt));
        //sábado 11 de junio de 2016 10:10:00 AM
        System.out.println(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.FULL).format(zdt));
        //sábado 11 de junio de 2016 10:10:00 AM CDT
        System.out.println(DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL).format(ldt));
        //System.out.println(DateTimeFormatter.ofLocalizedTime(FormatStyle.FULL).format(ldt));

        //System.out.println(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.LONG).format(ldt));
        System.out.println(DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG).format(ldt));
        //System.out.println(DateTimeFormatter.ofLocalizedTime(FormatStyle.LONG).format(ldt));

        System.out.println(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM).format(ldt));
        System.out.println(DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM).format(ldt));
        System.out.println(DateTimeFormatter.ofLocalizedTime(FormatStyle.MEDIUM).format(ldt));

        System.out.println(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT).format(ldt));
        System.out.println(DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT).format(ldt));
        System.out.println(DateTimeFormatter.ofLocalizedTime(FormatStyle.SHORT).format(ldt));

        LocalTime time = LocalTime.parse("10:10 AM", DateTimeFormatter.ofLocalizedTime(FormatStyle.SHORT));
        LocalDateTime dateTime = LocalDateTime.parse("11/06/2016 10:10:00 AM", DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM));
        DateTimeFormatter formatter = DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL);
        TemporalAccessor ta = formatter.parse("sábado 11 de junio de 2016");

        System.out.println(ta);
        System.out.println(ta);
        System.out.println(dateTime);
        System.out.println(dateTime);
    }
}
