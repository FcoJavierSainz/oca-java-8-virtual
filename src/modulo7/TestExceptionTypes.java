package modulo7;

import java.io.FileNotFoundException;

public class TestExceptionTypes {

  public static void main(String[] args) {
    System.out.println(isChecked(new Exception()));
    System.out.println(isChecked(new NullPointerException()));
    System.out.println(isNotChecked(new NullPointerException()));
    System.out.println(isNotChecked(new OutOfMemoryError()));
    System.out.println(isNotChecked(new FileNotFoundException()));

  }

  public static boolean isChecked(Throwable t) {
    return (t instanceof Exception) &&
        !(t instanceof RuntimeException);
  }

  public static boolean isNotChecked(Throwable t) {
    return t instanceof RuntimeException || t instanceof Error;
  }

}
