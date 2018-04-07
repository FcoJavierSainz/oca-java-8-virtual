package modulo4;

public class StringBuilderMethods {

  public static void main(String[] args) {
    StringBuilder sb = new StringBuilder("0123456");
    System.out.println(sb.replace(2, 4, "ABCD"));
    System.out.println(sb.reverse());

    StringBuilder sb1 = new StringBuilder("0123456");
    System.out.println(sb1.subSequence(2, 4));
    System.out.println(sb1);
  }

}
