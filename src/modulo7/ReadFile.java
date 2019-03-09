package modulo7;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadFile {

  public static void main(String[] args) throws FileNotFoundException {
    FileInputStream fis = new FileInputStream("hello.txt"); // checked exception
    Scanner s = new Scanner(fis);
    while (s.hasNext()) {
      System.out.println(s.nextLine());
    }
  }
}
