package modulo4;

public class StringChainedMethods {

  public static void main(String[] args) {
    String result = "Sunday ".replace(' ', 'Z').trim().concat("M n");
    System.out.println(result);
    //SundayZM n
    //SundayZM n

    System.out.println("Hola, ".concat("a todos!"));
  }
}
