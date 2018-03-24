package modulo2;

public class CortoCircuito {
    public static void main(String[] args) {
        Persona persona = null;

        if(persona != null && persona.nombre != null){
            System.out.println("Hola me llamo: " + persona.nombre);
        }

        if (isTrue() || isFalse()) {

        }
    }

    static boolean isTrue() {
        System.out.println("True");
        return true;
    }

    static boolean isFalse() {
        System.out.println("False");
        return false;
    }
}
