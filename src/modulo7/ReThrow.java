package modulo7;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ReThrow {

  FileInputStream fis;

  void method() throws IOException {
    try {
      fis = new FileInputStream("test.txt");
    } catch (FileNotFoundException e) {
      System.out.println("Cerrar recursos");
      throw e;
    }
  }

  public static void main(String[] args) {
    ReThrow r = new ReThrow();
    try {
      r.method();
    } catch (IOException e) {
      System.out.println("Exception handled!");
    }
  }

}
