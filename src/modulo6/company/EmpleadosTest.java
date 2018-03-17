package modulo6.company;

/**
 * Created by JavierSainz on 6/18/16.
 */
public class EmpleadosTest {
    public static void main(String[] args) {
        Empleado empleado = new Programador();
        Empleado empleado2 = new Manager();
        if (empleado instanceof Programador) {
            Programador programador = (Programador) empleado;
            programador.recibirTraining();
            ProgromadorSenior  ps = (ProgromadorSenior) programador;
        }

        imprimeSalario(empleado);
        imprimeSalario(empleado2);
    }

    public static void imprimeSalario(Asalariado e) {
        System.out.println(e.calcularSalarioNeto());
    }

}
