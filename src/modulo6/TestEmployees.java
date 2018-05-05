package modulo6;

import modulo6.development.Programmer;

public class TestEmployees {

  public static void main(String[] args) {


    Programmer p = new Programmer();
    p.programmingLanguages = new String[]{"Java", "C"};

    p.printName();

    p.work();

    ProjectManager pm = new ProjectManager("Raúl");

    pm.work();

  }
}
