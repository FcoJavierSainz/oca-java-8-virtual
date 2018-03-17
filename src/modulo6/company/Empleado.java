package modulo6.company;

/**
 * Created by JavierSainz on 6/18/16.
 */
public abstract class Empleado implements Asalariado{
    String nombre;
    String domicilio;
    String numeroTelefonico;
    double experiencia;

    public abstract void trabajar();

}
