package modulo4;

public class StringConcatenation {

  public static void main(String[] args) {
    String aString = "OCJA" + "Cert" + "Exam"; // ¿Cuántos Objetos String?


    int num = 10;
    int val = 12;
    String aStr = "OCJA";
    String anotherStr = num + val + aStr;

    // 10 + 12 + "OCJA"
    // 22 + "OCJA"
    // "22OCJA"

    System.out.println(anotherStr);

    String lang = "Java";
    lang += " is everywhere!";

    String initializedToNull = null;
    initializedToNull += "Java";
    System.out.println(initializedToNull);

  }

}
