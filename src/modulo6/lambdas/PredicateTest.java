package modulo6.lambdas;

import java.util.function.Predicate;

public class PredicateTest {

  public static void main(String[] args) {
    Predicate<String> p = new Predicate<String>() {
      @Override
      public boolean test(String s) {
        return s.startsWith("A");
      }
    };

    Predicate<String> p2 = s -> s.endsWith("r");

    System.out.println(p.or(p2).negate().test("Arthura"));

    Predicate<String> isEqual = Predicate.isEqual("Arthur");

    System.out.println(isEqual.test("Arthur"));
  }
}
