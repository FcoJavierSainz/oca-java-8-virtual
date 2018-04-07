package modulo4;

public class StringBuilderDelete {

  public static void main(String[] args) {
    StringBuilder sb1 = new StringBuilder("0123456");
    sb1.delete(2, 4);
    System.out.println(sb1);

    sb1.deleteCharAt(1);
    System.out.println(sb1);
  }
}
