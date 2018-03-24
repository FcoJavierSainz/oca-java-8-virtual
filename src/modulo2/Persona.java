package modulo2;

public class Persona {
    public String nombre;
    private int edad;

    public static void main(String[] args) {
        int edad = 30;

        Persona p1 = new Persona();
        p1.edad = edad;
        p1.nombre = "Javier";
        System.out.println(p1.nombre);

        Persona p2 = new Persona();
        p2.edad = 45;
        p2.nombre = "Raúl";
        System.out.println(p2.nombre);
    }
}
