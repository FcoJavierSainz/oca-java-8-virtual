package modulo3;

import java.util.ArrayList;

public class Persona {
    private String nombre;
    private int edad = 10;
    ArrayList<String> materias = new ArrayList<>();

    {
        materias.add("Matenaticas");
        materias.add("Español");
    }

    private static Persona instance = new Persona("Javier", 30);

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public Persona(String nombre) {
        this.nombre = nombre;
    }

    public Persona(String nombre, int edad, ArrayList<String> materias) {
        this.nombre = nombre;
        this.edad = edad;
        this.materias = materias;
    }

    public Persona() {
    }

    public static Persona instance() {
        return instance;
    }

    public static void main(String[] args) {
        Persona p = new Persona("Juan");
    }
}
