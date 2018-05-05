package modulo6.lambdas;

import java.util.ArrayList;
import modulo6.Employee;

class Test {

  public static void main(String args[]) {

    ArrayList<Employee> empArrList = new ArrayList<>();

    filter(empArrList, new ValidatePerformanceRating());
  }

  static void filter(ArrayList<Employee> list, Validate rule) {
    for (Employee e : list) {
      if (rule.check(e)) {
        System.out.println(e);
      }
    }
  }
}