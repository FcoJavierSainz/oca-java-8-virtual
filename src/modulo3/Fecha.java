package modulo3;

import java.util.Date;

public class Fecha {

    public Date fecha() {
        return new Date();
    }

    public Date fecha(long timestamp) {
        return new Date(timestamp);
    }

    public void fecha(String date) {
        new Date(date);
    }

    public void fecha(String date, long x) {
        new Date(date);
    }

    public void fecha(long x, String date) {
        new Date(date);
    }

    private Date fecha(int dia, int mes, int anio) {
        return new Date(anio, mes, dia);
    }

    public static void main(String[] args) {
        Fecha f = new Fecha();

        System.out.println(f.fecha(24, 3, 2018));


    }
}
