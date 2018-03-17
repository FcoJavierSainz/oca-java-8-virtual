package modulo6.company;

import java.util.ArrayList;

/**
 * Created by JavierSainz on 6/18/16.
 */
public class Manager extends Empleado  implements Entrenable, Entrevistador{
    int tamanoEquipo;

    @Override
    public void trabajar() {
        System.out.println("Lider");
    }

    @Override
    public void recibirTraining() {
        System.out.println("Toma curso de manejo de personal!");
    }

    @Override
    public void entrevistar() {
        System.out.println("Entrevista nuevo personal");
    }

    @Override
    public double obetenerSalario() {
        return 10_000;
    }
}
