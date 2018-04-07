package modulo4;

import java.util.Arrays;

public class MultiArrayInitialization {

  public static void main(String[] args) {
    int[] multiArr[];
    multiArr = new int[2][3];
    for (int i = 0; i < multiArr.length; i++) {
      for (int j = 0; j < multiArr[i].length; j++) {
        multiArr[i][j] = i + j;
      }
    }
    System.out.println(Arrays.deepToString(multiArr));

  }
}
