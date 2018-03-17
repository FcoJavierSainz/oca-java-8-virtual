package modulo1.figuras;

import modulo1.Cuadro;

import java.io.Serializable;

public final class Figuras extends Object implements Serializable {


    public static void main(String[] args) {
        Cuadro cuadro1 = new Cuadro(5);
        Cuadro cuadro2 = new Cuadro(6);

        System.out.println(cuadro1.getCuadrado());
        System.out.println(cuadro2.getCuadrado());

    }
}