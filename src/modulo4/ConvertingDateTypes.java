package modulo4;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class ConvertingDateTypes {

  public static void main(String[] args) {
    LocalDate interviewDate = LocalDate.of(2016, 02, 28);
    System.out.println(interviewDate.atTime(16, 30));
    System.out.println(interviewDate.atTime(16, 30, 20));
    System.out.println(interviewDate.atTime(16, 30, 20, 300));
    System.out.println(interviewDate.atTime(LocalTime.of(16, 30)));

    LocalTime time = LocalTime.of(14, 10, 0);
    LocalDate date = LocalDate.of(2016, 02, 28);
    LocalDateTime dateTime = time.atDate(date);
    System.out.println(dateTime);

    LocalDate launchBook = LocalDate.of(2016,2,8);
    LocalDate aDate = LocalDate.of(1970,1,8);
    System.out.println(launchBook.toEpochDay());
    System.out.println(aDate.toEpochDay());
  }

}
