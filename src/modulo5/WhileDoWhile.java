package modulo5;

/**
 * Created by JavierSainz on 6/18/16.
 */
public class WhileDoWhile {
    public static void main(String[] args) {
        while1();
        System.out.println("**************************");
        while2();
        System.out.println("**************************");
        while3();
        System.out.println("**************************");
        while4();
        System.out.println("**************************");
        while5();
        System.out.println("**************************");
        while6();
    }

    public static void while1() {
        int x = 0;
        int y = 10;
        do {
            y--;
            ++x;
        } while (x < 5);
        System.out.println(x + "," + y);
    }

    public static void while2() {
        int num = 9;
        boolean divisibleBy7 = false;
        while (!divisibleBy7) {
            System.out.println(num);
            if (num % 7 == 0)
                divisibleBy7 = true;
            --num;
        }
    }

    public static void while3() {
        int num = 9;
        boolean divisibleBy7 = true;
        while (divisibleBy7 == false) {
            System.out.println(num);
            if (num % 7 == 0) divisibleBy7 = true;
            --num;
        }
    }

    public static void while4() {
        int num = 9;
        boolean divisibleBy7 = false;
        do {
            System.out.println(num);
            if (num % 7 == 0) divisibleBy7 = true;
            --num;
        } while (divisibleBy7 == false);
    }

    public static void while5() {
        int num = 10;
        do {
            num++;
        } while (++num > 20);
        System.out.println(num);
    }

    public static void while6() {
        int num = 10;
        while (++num > 20) {
            num++;
        }
        System.out.println(num);
    }
}