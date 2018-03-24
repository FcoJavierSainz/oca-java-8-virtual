package modulo2;

public class Persona {
    public String nombre;
    private int edad;

    void imprimeNombre () {
        System.out.println(nombre);
    }

    public static void main(String[] args) {
        int edad = 30;

        Persona p1 = new Persona();
        p1.edad = edad;
        p1.nombre = "Javier";
        System.out.println(p1.nombre);

        Persona p2 = new Persona();
        p1.edad = edad;
        p1.nombre = "Javier";
        System.out.println(p2.nombre);

        int edad2 = 30;

        System.out.println(edad == edad2);
        p2 = p1;
        System.out.println(p1 == p2);
    }
}
