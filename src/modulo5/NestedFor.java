package modulo5;

public class NestedFor {

  public static void main(String[] args) {
    int[][] matriz = {
        {1, 2, 8, 9},
        {2, 4, 9, 12},
        {4, 7, 10, 13},
        {6, 8, 11, 15}
    };
    System.out.println(findNumber(matriz, 2));

  }

  public static boolean findNumber(int[][] matrix, int numberTofind) {
    boolean result = false;

    externalFor:
    for (int i = 0; i < matrix.length; i++) {
      for (int j = 0; j < matrix[i].length; j++) {
        System.out.println(i +"," + j + ": " + matrix[i][j]);
        if (matrix[i][j] == numberTofind) {
          result = true;
          break externalFor;
        }
      }
    }

    emptyBlock:
    {
      break emptyBlock;
    }

    return result;
  }
}
