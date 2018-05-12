package modulo7;

public class RecursiveMethod {

  public static void main(String[] args) {
    recursive();
  }

  public static void recursive() {
    System.out.println("Running...");
    recursive();
  }
}
