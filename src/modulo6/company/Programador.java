package modulo6.company;

import java.time.LocalDateTime;

/**
 * Created by JavierSainz on 6/18/16.
 */
public class Programador extends Empleado implements Entrenable {
    String[] lenguagesDeProgramacion;

    public static void main(String[] args) {
        Programador p = new Programador();
        Manager m = new Manager();
        LocalDateTime ldt = LocalDateTime.of(2016, 6, 15, 12, 5, 12);
        ldt.now();
        Entrevistador.reservarSalaDEJuntas(LocalDateTime.now(), "Principal");
        System.out.println(m.calcularSalarioNeto());
    }

    @Override
    public void trabajar() {
        System.out.println("Programa " + nombre);
    }

    @Override
    public void recibirTraining() {
        System.out.println("Curso OCA JAVA SE PROGRAMMER I");
    }

    @Override
    public double obetenerSalario() {
        return 80_000;
    }
}
