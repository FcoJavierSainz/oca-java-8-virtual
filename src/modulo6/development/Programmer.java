package modulo6.development;

import modulo6.Employee;

public class Programmer extends Employee {

  public String[] programmingLanguages;

  public Programmer() {
    this("Default");
  }

  public Programmer(String name) {
    super(name);
  }

  public void printName() {
    System.out.println(getName());
  }

  @Override
  public void work() {
    System.out.println("Codificando");
  }
}
