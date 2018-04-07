package modulo4;

public class Equals {

  public static void main(String[] args) {
    String var1 = new String("Java");
    String var2 = new String("Java");

    System.out.println(var1.equals(var2));
    System.out.println(var1 == var2);

    String sub1 = var1.substring(0, 1);
    String sub2 = var2.substring(0, 1);

    // System.out.println(sub1 == sub2); // ???

  }

  public static boolean equals(String str1, String str2) {

  }

}
