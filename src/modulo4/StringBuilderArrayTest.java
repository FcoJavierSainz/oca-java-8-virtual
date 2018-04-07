package modulo4;

public class StringBuilderArrayTest {

  public static void main(String[] args) {
    StringBuilder sb1 = new StringBuilder("Oracle");
    char[] name = {'J', 'a', 'v', 'a', '7'};
    sb1.insert(3, name, 1, 2);
    System.out.println(sb1);
  }
}
