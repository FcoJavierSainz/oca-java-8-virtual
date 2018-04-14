package modulo4;

import java.time.Period;

public class ParsingPeriod {

  public static void main(String[] args) {
    Period p5Yrs1 = Period.parse("P5y");
    Period p5Yrs2 = Period.parse("p5y");
    Period p5Yrs3 = Period.parse("P5Y");
    Period p5Yrs4 = Period.parse("+P5Y");
    Period p5Yrs5 = Period.parse("P+5Y");
    Period p5Yrs6 = Period.parse("-P-5Y");
    System.out.println(p5Yrs1 + ":" + p5Yrs6);

    Period p5Yrs7 = Period.parse("P5y1m2d");
    Period p5Yrs8 = Period.parse("p9m");
    Period p5Yrs9 = Period.parse("P60d");
    Period p5Yrs10 = Period.parse("-P5W");
    System.out.println(p5Yrs10);

  }
}
