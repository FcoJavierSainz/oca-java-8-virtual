package modulo6.inheritance;

public class Avion extends Vehiculo implements Volador {

  @Override
  public void volar() {
    System.out.println("Vuela a 30000 pies de altura");
  }

  @Override
  public void aterrizar() {
    System.out.println("Avion aterriza en pista");
  }

  public static void main(String[] args) {
    Volador v = new Aguila("");

    v.aterrizar();

    if (v instanceof Aguila) {
      Aguila a = (Aguila) v;
    } else {
      Avion a = (Avion) v;
    }

  }
}
