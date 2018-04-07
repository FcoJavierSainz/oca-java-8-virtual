package modulo4;

public class Equals {

  public static void main(String[] args) {
    String var1 = new String("Java");
    String var2 = new String("Java");

    System.out.println(var1.equalsIgnoreCase(var2));
    System.out.println(var1 == var2);

    System.out.println("My Equals: " + equals("java", var2));

    String sub1 = var1.substring(0, 1);
    String sub2 = var2.substring(0, 1);

    System.out.println(sub1 == sub2);

  }

  public static boolean equals(String str1, String str2) {
    if (str1 == null || str2 == null) {
      return false;
    }

    if (str1.length() != str2.length()) {
      return false;
    }

    for (int index = 0; index < str1.length(); index++) {
      if (str1.charAt(index) != str2.charAt(index)) {
        return false;
      }
    }

    return true;
  }

  public static boolean equalsIgnoreCase(String str1, String str2) {
    if (str1 == null || str2 == null) {
      return false;
    }
    return equals(str1.toLowerCase(), str2.toLowerCase());
  }

}
