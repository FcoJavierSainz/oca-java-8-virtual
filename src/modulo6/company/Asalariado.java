package modulo6.company;

import java.io.Serializable;

/**
 * Created by JavierSainz on 6/18/16.
 */
public interface Asalariado extends Serializable {
    double ISR = 0.30;
    double CUOTA_IMSS = 550.50;

    double obetenerSalario();

    default double calcularSalarioNeto() {
        double salario = obetenerSalario();
        salario  = salario - (salario * ISR);
        salario -= CUOTA_IMSS;
        return salario;
    }
}
