package modulo6.inheritance;

public class Aguila extends Animal implements Volador {
  String tipo;

  public Aguila(String tipo) {
    this.tipo = tipo;
  }

  @Override
  public void volar() {
    System.out.println();
  }


  public Aguila unirVuelo() {
    return new Aguila("X");
  }

  @Override
  public void aterrizar() {

  }

  public static void main(String[] args) {
    Volador volador = new Aguila("Y");

  }
}
