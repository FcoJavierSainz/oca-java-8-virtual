package modulo7;

public class RecursiveMethod {

  public static void main(String[] args) {
    try {
      recursive();
    } catch (StackOverflowError s) {
      System.out.println(s);
      newMethod();
    }
  }

  public static void recursive() {
    System.out.println("Running...");
    recursive();
  }

  public static void newMethod() {
    System.out.println("Hola");
  }
}
