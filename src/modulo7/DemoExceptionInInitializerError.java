package modulo7;

public class DemoExceptionInInitializerError {

  static String name = null;
  static int nameLength = name.length();

  public static void main(String[] args) {

  }

  static String name2 = getName();

  static String getName() {
    throw new MyException();
  }
}
