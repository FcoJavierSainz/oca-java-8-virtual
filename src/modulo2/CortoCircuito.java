package modulo2;

public class CortoCircuito {
    public static void main(String[] args) {
        Persona persona = new Persona();

        if(persona != null && persona.nombre != null){
            System.out.println("Hola me llamo: " + persona.nombre);
        }

    }
}
