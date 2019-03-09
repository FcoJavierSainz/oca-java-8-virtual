package modulo6.lambdas;

import java.util.function.IntPredicate;

public class TestIntPredicate {

  public static void main(String[] args) {
    IntPredicate primitive = number -> number % 2 == 0;
    System.out.println(primitive.test(4));
    System.out.println(primitive.test(5));
  }
}
