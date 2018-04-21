package modulo5;

public class ForExercise {

  public static void main(String[] args) {
    // resolve this problem https://codefights.com/arcade/code-arcade/labyrinth-of-nested-loops/yBFfNv5fTqhcacZ7w

    System.out.println(countHi("hi hi Hola hihihihihihi "));
  }

  public static int countHi(String input) {
    int count = 0;
    for (int lastIndex = 0; lastIndex > -1; ) {
      lastIndex = input.indexOf("hi", lastIndex);
      if (lastIndex > -1) {
        count++;
        lastIndex += 2;
      }
    }
    return count;
  }

}
