package modulo6.development;

import modulo6.Employee;
import modulo6.Trainable;

public class Programmer extends Employee implements Trainable {

  public String[] programmingLanguages;

  private String name;

  public Programmer() {
    this("Default");
  }

  public Programmer(String name) {
    //super();
    super(name);
  }

  public void printName() {
    System.out.println(getName());
  }

  @Override
  public void work() {
    System.out.println("Codificando");
  }

  @Override
  public void train() {
    System.out.println("Entrenar programador");
  }

  @Override
  public void setName(String name) {
    super.setName(name);
    this.name = name;
  }

  @Override
  public String getName() {
    return name;
  }


  @Override
  public Programmer clone() {
    return new Programmer(name);
  }

}
