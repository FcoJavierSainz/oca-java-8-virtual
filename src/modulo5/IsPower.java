package modulo5;

public class IsPower {
  boolean isPower(int n) {
    if (n == 1) {
      return true;
    }
    int result = 0;
    for (int a = 2; (a * a) <= n; a++) {
      for (int b = 2; result < n; b++) {
        result = (int) Math.pow(a, b);
        if (result == n) {
          return true;
        }
      }
      result = 0;
    }

    return false;
  }

  public static void main(String[] args) {
    System.out.println(new IsPower().isPower(25));
  }
}
