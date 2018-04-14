package modulo4;

import java.time.Period;

public class PeriodTest {

  public static void main(String[] args) {
    Period period1 = Period.of(1, 2, 7);
    Period period2 = Period.ofYears(2);
    Period period3 = Period.ofMonths(5);
    Period period4 = Period.ofWeeks(10);
    Period period5 = Period.ofDays(15);

  }
}
