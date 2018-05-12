package modulo7;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ReThrow {

  FileInputStream fis;

  void method() {
    try {
      fis = new FileInputStream("test.txt");
    } catch (FileNotFoundException e) {
      //throw e;
    }
  }

}
