package modulo2;

public class TiposDeDatos {
    public static void main(String[] args) {
        // enteros
        int x = 0; // 32 bits con signo
        long l = 70; // 64 bits con signo
        byte b = 12; // 8 bits con signo
        short s = 80; // 16 bits con signo

        long positive = 9223372036854775100l;


        // flotantes

        float f = l; // 32 bits
        double d = f; // 64 bits

        // byte, short, int, long, float, double

        int base2 = 0b1111;
        System.out.println(base2);

        int base16 = 0xFF;
        // 1111 1111
        System.out.println(base16);

        int base8 = 010;
        System.out.println(base8);

        int espacios = 10_000;
        System.out.println(espacios);

        double cientifico = 1.78978978979e2;

        boolean truth = true;

        char c = '\u00F1'; // 16 bits sin signo
        // unicode = 4*4 = 16

        char ¥charEjemplo3 = (char) -122;


        // f = 1111

        System.out.println(¥charEjemplo3);

        // 10 / 3 = 3.33333333333333
        // $3,333.34

        System.out.println(Integer.parseInt("10_000"));


    }
}
