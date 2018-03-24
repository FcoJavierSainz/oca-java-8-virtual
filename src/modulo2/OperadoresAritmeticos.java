package modulo2;

public class OperadoresAritmeticos {
    public static void main(String[] args) {
        System.out.println(10 / 6);
        System.out.println(10 / 6 * 6.0);
        // (10 / 6) * 6.0
        // 1 * 6.0
        // 6.0


        int a = 5;
        a = (++a) * 2;
        System.out.println(a);

        a = 5;
        a = (a++) * 2;
        System.out.println(a);
    }
}
