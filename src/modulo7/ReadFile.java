package modulo7;

import java.io.FileInputStream;
import java.util.Scanner;

public class ReadFile {

  public static void main(String[] args) {
    FileInputStream fis = null; //new FileInputStream("file.txt");
    Scanner s = new Scanner(fis);
    while (s.hasNext()) {
      System.out.println(s.nextLine());
    }
  }
}
