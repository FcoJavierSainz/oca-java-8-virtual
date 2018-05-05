package modulo6;

import java.time.LocalDateTime;

public interface Interviewer {

  void interview();

  default void submitInterviewStatus() {
    System.out.println("Accept");
  }

  static void bookConferenceRoom(LocalDateTime dateTime, int duration) {
    System.out.println("Interview scheduled on:" + dateTime);
    System.out.println("Book conference room for: " + duration + " hrs");
  }

}
