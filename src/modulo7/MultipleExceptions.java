package modulo7;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class MultipleExceptions {

  public static void main(String args[]) {
    FileInputStream fis = null;
    try {
      fis = new FileInputStream("file.txt");
      System.out.println("File Opened");
      fis.read();
      System.out.println("Read File ");
    } catch (FileNotFoundException fnfe) {
      System.out.println("File not found");
    } catch (IOException ioe) {
      System.out.println("File Closing Exception");
    } finally {
      try {
        if (fis != null) {
          fis.close();
        }
      } catch (IOException e) {
        e.printStackTrace();
      }
      System.out.println("finally");
    }
    System.out.println("Next task..");
  }
}
