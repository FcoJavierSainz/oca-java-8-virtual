package modulo4;

import java.util.Arrays;

public class MultiArrayInitialization {

  public static void main(String[] args) {
    int[] multiArr[];
    multiArr = new int[2][3];
    for (int i = 0; i < multiArr.length; i++) {
      for (int j = 0; j < multiArr[i].length; j++) {
        multiArr[i][j] = i + j;
        // [1] [0]
      }
    }

    multiArr[0][0] = 10;
    multiArr[1][2] = 1210;
    multiArr[0][1] = 110;
    multiArr[0][2] = 1087;

    int x = multiArr[1][2];

    System.out.println(Arrays.deepToString(multiArr));


    int[][][] a = new int[2][2][4];
  }
}
