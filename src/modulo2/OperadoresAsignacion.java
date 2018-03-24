package modulo2;

public class OperadoresAsignacion {
    public static void main(String[] args) {
        int a = 5; int b = 4;
        a += b;
        System.out.println(a);
        a -= b;
        System.out.println(a);
        a *= b;
        System.out.println(a);
        a /= 5;
        System.out.println(a);
        // a = 4 % 2; (4/2) = residuo es 0
        // 5 % 2 = 2 y sobra 1, el modulo es 1

        a %= 2;
        System.out.println(a);

    }
}
