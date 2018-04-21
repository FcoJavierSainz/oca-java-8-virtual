package modulo5;

public class NestedFor {

  public static void main(String[] args) {
    int[][] matriz = {{1, 2, 8, 9}, {2, 4, 9, 12}, {4, 7, 10, 13}, {6, 8, 11, 15}};
    for (int i = 0; i < matriz.length; i++) {
      for (int j = 0; j < matriz[i].length; j++) {
        System.out.print(matriz[i][j] + "\t");
      }
      System.out.println();
    }

  }
}
