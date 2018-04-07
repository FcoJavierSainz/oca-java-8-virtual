package modulo4;

import java.util.Arrays;

public class ArrayCombined {

  public static void main(String[] args) {
    int intArray2[] = new int[]{0, 1};
    String[] strArray2 = {"Summer", "Winter",};
    // multi dimensions
    print(new String[] {"A","B"});

    int multiArray2[][] = {
        {0, 1},
        {3, 4, 5}
    };
    //equivalente
    multiArray2[0] = new int[]{0, 1};
    multiArray2[1] = new int[]{3, 4, 5};

  }

  public static void print(String[] cadenas) {
    System.out.println(Arrays.deepToString(cadenas));
  }
}
