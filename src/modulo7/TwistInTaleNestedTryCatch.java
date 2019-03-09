package modulo7;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class TwistInTaleNestedTryCatch {

  static FileInputStream players, coach;

  public static void main(String args[]) {

    try {
      players = new FileInputStream("players.txt");
      System.out.println("players.txt found");
      try {
        coach.close();
      } catch (IOException e) {
        System.out.println("coach.txt not found");
      }
    } catch (FileNotFoundException fnfe) {
      System.out.println("players.txt not found");
    } catch (NullPointerException ne) {
      System.out.println("My message NullPointerException");
    }
  }
}
