package modulo5;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class DoWhileLoop {

  public static void main(String[] args) {
    InputStreamReader isr = new InputStreamReader(System.in);
    BufferedReader br = new BufferedReader(isr);
    boolean isAValidNumber = false;
    do {
      System.out.println("Escribe un número valido");
      try {
        System.out.println(Integer.parseInt(br.readLine()));
        isAValidNumber = true;
      } catch (Exception e) {
      }
    } while (!isAValidNumber);

  }
}
