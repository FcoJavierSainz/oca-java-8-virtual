package modulo6.lambdas;

import modulo6.Employee;

public class ValidateName implements Validate {

  public boolean check(Employee emp) {
    return (emp.getName().startsWith("P"));
  }
}