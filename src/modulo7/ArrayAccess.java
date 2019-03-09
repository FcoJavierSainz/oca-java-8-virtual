package modulo7;

public class ArrayAccess {

  public static void main(String[] args) {
    method1();
  }

  public static void method1() {
    method2();
  }

  public static void method2() {
    String[] names = {"Java", "lambdas", "Streams"};
    System.out.println(names[3]); // no checked exception
  }
}
