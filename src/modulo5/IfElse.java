package modulo5;

public class IfElse {

  public static void main(String[] args) {
    int score = 500;
    if (score > 200) {
      if (score < 400) {
        if (score > 300) {
          System.out.println(1);
        } else {
          System.out.println(2);
        }
      } else {
        System.out.println(3);
      }
    }
  }
}
