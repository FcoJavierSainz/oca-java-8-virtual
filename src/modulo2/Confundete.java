package modulo2;

public class Confundete {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int c = 30;

        a = b + c;
        a = a / 2;
        b = a;
        a = 10;
        c = b = a;

        System.out.println(a == c && c == b);
        System.out.println(a++ == 11 || ++b == 10);
        System.out.println(!(c > 10) && !(a == 10));
    }
}
