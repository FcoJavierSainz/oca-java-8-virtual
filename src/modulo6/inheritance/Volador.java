package modulo6.inheritance;

public interface Volador {

  void volar();



  default void aterrizar() {
    System.out.println("Aterrizar");
  }


  static void otro() {
    System.out.println("Otro");
  }



}
