package modulo2;

public class Presedencia {
    public static void main(String[] args) {
        System.out.println(10 % 20 * 30 + 10 / 20);

        // (10 % 20) * 30 + 10 / 20
        // (10 * 30) + 10 / 20
        // 300 + (10 / 20)
        // 300 + 0
        // 300


        System.out.println(10 % 20 * (30 + 10) / 20);
        // 10 % 20 * 40 / 20
        // (10 % 20) * 40 / 20
        // (10 * 40) / 20
        // 400 / 20
        // 20

        int a = 10;

        System.out.println(- --a);
        System.out.println(a);
        // -10
        // a = a - 1 = 9

        a += a--;

        System.out.println(a);

    }
}
