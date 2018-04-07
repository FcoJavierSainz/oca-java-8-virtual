package modulo4;

public class StringBuilderArrayTest {

  public static void main(String[] args) {
    StringBuilder sb1 = new StringBuilder();
    char[] name = {'J', 'a', 'v', 'a', '7'};
    sb1.append(name, 1, 3);
    System.out.println(sb1);
  }
}
