package modulo2;

public class OperadoresRelacionales {
    public static void main(String[] args) {
        System.out.println('a' > 'b');
        System.out.println((int)'a');

        int a = 10, b = 15;
        System.out.println(a > 'a');

        double c = 10.0;
        boolean bool1 = a < b; //a menor a b = true
        boolean bool2 = a > b;//a mayor a b = false
        //a <= b;//a menor o igual a b = true
        //a >= b;//a mayor o igual a b = false
        boolean bool3 = a == c;//a es identico a c = true
        //a != b;//a no es identico a b = true

        System.out.println(bool3);

        System.out.println(a = b);//Esto va a imprimir 15
        System.out.println(b = a);//Esto va a imprimir 15

        boolean bandera = true;
        boolean bandera2 = true;

        System.out.println(bandera == bandera2);

        if(bandera = false) {
            System.out.println("Nunca entra");
        }

    }
}
