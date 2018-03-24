package modulo2;

public class OperadoresRelacionales {
    public static void main(String[] args) {
        int a = 10, b = 15;
        double c = 10.0;
        //a < b; //a menor a b = true
        //a > b;//a mayor a b = false
        //a <= b;//a menor o igual a b = true
        //a >= b;//a mayor o igual a b = false
        //a == c;//a es identico a c = true
        //a != b;//a no es identico a b = true

        System.out.println(a = b);//Esto va a imprimir 15
        System.out.println(b = a);//Esto va a imprimir 10

        boolean bandera = true;
        System.out.println(bandera = false);//Esto va a imprimir false

    }
}
