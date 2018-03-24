package modulo3;

import java.util.ArrayList;

public class Persona {
    private String nombre;
    private int edad;
    ArrayList<String> materias = new ArrayList<>();

    {
        materias.add("Matenaticas");
        materias.add("Español");
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    private static Persona instance = new Persona("Javier", 30);

    public Persona(String nombre, int edad) {
        super();
        this.nombre = nombre;
        this.edad = edad;
    }

    public Persona(String nombre) {
        this(nombre, 10);
    }

    public Persona(String nombre, int edad, ArrayList<String> materias) {
        this(nombre, edad);
        this.materias = materias;
    }

    public Persona() {
        super();
    }

    public static Persona instance() {
        return instance;
    }

    public static void main(String[] args) {
        Persona p = new Persona("Juan");
    }
}
