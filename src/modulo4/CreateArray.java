package modulo4;

public class CreateArray {

  public static void main(String[] args) {
    // primitivos
    int[] primitivos = new int[]{1, 2, 3, 4};
    // Objetos
    String[] objetos = new String[]{"A", "B"};
    // ¿Cómo se almacenan en memoria?

    //System.out.println(primitivos[0]);

    String[] myArray = new String[4];

    int[][] multidimentional = new int[2][3];

    //[0][0]
    //[0][0]
    //[0][0]

    int intArray[];
    intArray = new int[2];
    for (int i = 0; i < intArray.length; i++) {
      intArray[i] = i + 5;
    }

    System.out.println(intArray[0]);
    System.out.println(intArray[1]);

    intArray[0] = 10;
    intArray[1] = 1870;


    System.out.println(intArray[0]);
    System.out.println(intArray[1]);

  }
}
