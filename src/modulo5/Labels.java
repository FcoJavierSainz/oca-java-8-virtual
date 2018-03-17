package modulo5;

/**
 * Created by JavierSainz on 6/18/16.
 */
public class Labels {
    public static void main(String[] args) {
        String[] programmers = {"Paul", "Shreya", "Selvan", "Harry"};
        externo:
        for (String externo : programmers) {
            for (String interno : programmers) {
                if (interno.equals("Shreya")) {
                    continue externo;//es la etiqueta, no la variable
                }
                System.out.println(interno);
            }
        }

    }
}
