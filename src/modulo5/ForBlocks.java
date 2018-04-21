package modulo5;

public class ForBlocks {

  public static void main(String[] args) {
    int tableOf = 25;


    for (int ctr = 1, x = 8; ctr <= 5 && x > 4; ctr++, x--, hello()) {
      System.out.println(tableOf * ctr);
    }



    /*for (int ctr = 1, long x = 8; ctr <= 5; String error = ""){
      System.out.println(tableOf * ctr);
    }*/
  }

  public static void hello() {
    System.out.println("Hello");
  }

}
