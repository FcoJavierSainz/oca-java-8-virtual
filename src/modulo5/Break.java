package modulo5;

/**
 * Created by JavierSainz on 6/18/16.
 */
public class Break {
    public static void main(String[] args) {
        String[] programmers = {"Paul", "Shreya", "Selvan", "Harry"};
        for (String name: programmers) {
            if (name.equals("Shreya")) {
                continue;
            }
            Hola: System.out.println(name);
        }
        miBloque:
        {

            System.out.println(programmers[0]);
            miEtiqueta:
            if (true) {
                break miBloque;
            }
            System.out.println(programmers[2]);
        }
    }
}
