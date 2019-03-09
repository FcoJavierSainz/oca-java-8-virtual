package modulo6;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import modulo6.development.Programmer;

public class TestEmployees {

  public static void main(String[] args) {

    Programmer p = new Programmer();
    p.programmingLanguages = new String[]{"Java", "C"};

    p.printName();

    p.work();

    ProjectManager pm = new ProjectManager("Raúl");

    pm.work();

    pm.getName();
    pm.setName("Hola");

    pm.submitInterviewStatus();

    Interviewer.bookConferenceRoom(LocalDateTime.now(), 10);

    System.out.println(Interviewer.MINIMUM_AGE);

    Manager m = pm;

    Employee e = pm;

    Interviewer i = pm;

    i.interview();

    e.work();

    int y = ProjectManager.x;


    List<Trainable> t  = new ArrayList<>();

    t.add(new Programmer("Misael"));
    t.add(new Programmer("Aida"));
    t.add(new Scholar());
    train(t);

    Programmer programmer = new Programmer("Javier");

    programmer.setName("Derian");

    programmer.printName();

    //programmer.work();

    Employee employe = programmer;

    employe.printNameEmployee();

    // overriding

    employe.work();

    Employee e2 = programmer.clone();
    System.out.println(e2.getName());

  }

  public static void train(List<Trainable> people) {
    for (Trainable t : people) {
      t.train();
    }
  }

  public static void work(List<Employee> people) {
    for (Employee e : people) {
      e.work();
    }
  }

}
