package modulo3;

public class PersonaTest {
    public static void main(String[] args) {
        Persona p = Persona.instance();
        Persona p2 = new Persona("Jorge", 23);
        int x = 5;
        printName(p2, x);
        System.out.println(x);
        System.out.println(p2.getNombre());
    }

    static void printName(Persona p, int  x) {
        x =  10;
        System.out.println(x);
        p.setNombre("Juan");
        System.out.println(p.getNombre());
    }
}
