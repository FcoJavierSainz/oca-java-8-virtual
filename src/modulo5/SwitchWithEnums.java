package modulo5;

public class SwitchWithEnums {

  public static void main(String[] args) {
    Size mySize = Size.LARGE;
    switch (mySize) {
      case LARGE:
        System.out.println("Large");
        break;
      case SMALL:
        System.out.println("Small");
        break;
      case MEDIUM:
        System.out.println("Medium");
    }
  }

  enum Size {
    SMALL, MEDIUM, LARGE
  }
}
