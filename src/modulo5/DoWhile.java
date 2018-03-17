package modulo5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by JavierSainz on 6/18/16.
 */
public class DoWhile {
    public static void main(String[] args) {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        //Clean code
        boolean isNotValidNumber = true;
        do {
            System.out.println("Ingresa un número.");
            try {
                int number = Integer.parseInt(br.readLine());
                System.out.println(number);
                isNotValidNumber = false;
            } catch (Exception e) {
            }
        } while (isNotValidNumber);
    }
}
