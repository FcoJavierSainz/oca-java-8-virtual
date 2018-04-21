package modulo5;

public class Golf {

  public static String calcularPuntaje(int golpes, int par) {
    if (golpes < 1 || par < 1) {
      throw new IllegalArgumentException();
    }

    int diferencia = golpes - par;

    if (golpes == 1) {
      return "Hoyo en uno!";
    }
    else
      if (diferencia <= -2) {
        return "Eagle";
      }
      else
        if (diferencia == -1) {
          return "Birdie";
        }
        else
          if (diferencia == 0) {
            return "Par";
          }
          else
            if (diferencia == 1) {
              return "Bogey";
            }
    return "Double bogey ";
  }

  public static void main(String[] args) {
    assert "Hoyo en uno!".equals(calcularPuntaje(1, 1));

    System.out.println(calcularPuntaje(2,100));

    int golpes = 2;
    if (golpes != 1)
      System.out.println("No hoyo en uno");
  }
}
