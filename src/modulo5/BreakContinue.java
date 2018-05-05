package modulo5;

public class BreakContinue {

  public static void main(String[] args) {
    String[] programmers = {"Paul", "Shreya", "Selvan", "Harry"};
    for (String name : programmers) {
      if (name.equals("Shreya")) {
        continue;
      }
      System.out.println(name);
    }

    externalBlock:
    {
      if (programmers[1].equals("Paul")) {
        break externalBlock;
      }
      System.out.println(programmers);
    }
  }
}
