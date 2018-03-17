package modulo6.company;

import java.time.LocalDateTime;

/**
 * Created by JavierSainz on 6/18/16.
 */
public interface Entrevistador {
    void entrevistar();
    static void reservarSalaDEJuntas(LocalDateTime time, String sala) {
        System.out.println("Sala " + sala + " reservada para " + time);
    }
}
