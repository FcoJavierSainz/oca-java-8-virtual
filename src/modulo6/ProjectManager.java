package modulo6;

public class ProjectManager extends Manager {

  public ProjectManager(String newName) {
    super(newName);
  }

  @Override
  public void work() {
    System.out.println("Report status");
  }

  @Override
  public void interview() {
    System.out.println(Interviewer.MINIMUM_AGE);
    System.out.println("Entrevistar");
  }

}
