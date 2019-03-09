package modulo6.lambdas;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class PlayWithStream {

  public static void main(String[] args) {
    List<String> bradyBunch = Arrays.asList("Peterrrrrrrrrrrrrrrrrrrrrr");

    // get the biggest name (length) that does not start with P
    Optional<Integer> max = bradyBunch
        .stream()
        .filter(name -> !name.startsWith("P"))
        .map(name -> name.length())
        .max(Integer::compareTo); // method reference;
    System.out.println(max.orElseGet(() -> 0));
  }
}
