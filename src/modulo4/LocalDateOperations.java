package modulo4;

import java.time.LocalDate;

public class LocalDateOperations {

  public static void main(String[] args) {

    // minus
    LocalDate date = LocalDate.now();

    // plus
    LocalDate leap = LocalDate.of(2016,02,29);

    // with
    LocalDate regular = LocalDate.of(2017,02,28);
  }
}
