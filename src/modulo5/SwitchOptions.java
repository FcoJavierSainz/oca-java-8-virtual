package modulo5;

public class SwitchOptions {

  public static void main(String[] args) {
    char c = 'a';
    final int option = 9;
    Integer i = Integer.valueOf(4);

    switch (i) {
      case (int)'a':
        System.out.println("Is a");
        break;
      case 4:
        System.out.println("Is 4");
        break;
      case option:
        System.out.println("Is option");

    }
  }
}
