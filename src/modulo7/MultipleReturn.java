package modulo7;


class MultipleReturn {

  StringBuilder getInt() {
    StringBuilder sb = new StringBuilder("10");
    try {

      String[] students = {"Harry", "Paul"};
      System.out.println(students[5]);
    } catch (Exception e) {
      System.out.println("Exception");
      return sb;
    } finally {
      sb = new StringBuilder("Hola");
    }
    return new StringBuilder();
  }

  // return = 0x1234

  // sb = 0x1235

  //Memory =  char = ['1', '0'] <- 0x1234
  //Memory =  char = ['H', 'o', 'l', 'a'] <- 0x1235

  public static void main(String args[]) {
    MultipleReturn var = new MultipleReturn();
    System.out.println(var.getInt());
  }
}