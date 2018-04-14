package modulo4;

import java.time.LocalDate;
import java.time.LocalTime;

public class ConvertingDateToDateTime {

  public static void main(String[] args) {
    LocalDate interviewDate = LocalDate.of(2016, 02, 28);
    System.out.println(interviewDate.atTime(16, 30));
    System.out.println(interviewDate.atTime(16, 30, 20));
    System.out.println(interviewDate.atTime(16, 30, 20, 300));
    System.out.println(interviewDate.atTime(LocalTime.of(16, 30)));
  }

}
