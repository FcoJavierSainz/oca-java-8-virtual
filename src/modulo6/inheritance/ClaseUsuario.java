package modulo6.inheritance;

public class ClaseUsuario implements Volador {

  @Override
  public void volar() {
    System.out.println("Volar");
    aterrizar();
  }

  public static void main(String[] args) {
    Volador.otro();
  }
}
