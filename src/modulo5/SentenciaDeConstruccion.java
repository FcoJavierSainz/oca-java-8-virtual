package modulo5;

public class SentenciaDeConstruccion {

  public static void main(String[] args) {
    int golpes = 2;
    if (golpes == 1)
      for (int i = 1; i <= 5; i++)
        System.out.println("Hurra!!");
    else
      System.out.println("Else");
  }
}
