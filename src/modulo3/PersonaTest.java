package modulo3;

public class PersonaTest {
    public static void main(String[] args) {
        Persona p = Persona.instance();
        Persona p2 = new Persona("Jorge", 23);
        System.out.println(p == p2);
    }
}
