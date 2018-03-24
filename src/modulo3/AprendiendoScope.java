/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package modulo3;

/**
 * @author CarlosIván
 */
public class AprendiendoScope {
    static int globalVar1 = 5;

    int globalVar2 = 5;

    public static void main(String[] arguments) {
        // Probando variables globales
        System.out.println("Valor de variable global 1: " + globalVar1);
        // las variables estaticas se declaran fuera de los metodos y su valor
        //es el mismo durante la vida del objeto
        globalVar1 = globalVar1 * 2;
        System.out.println("Valor de variable global 1: " + globalVar1);
        alterarVariableGlobal();
        System.out.println("Valor de variable global 1: " + globalVar1);


        // Probando variables globales no estaticas
        // System.out.println("Valor de variable global 1: " + globalVar2); //error de compilación
        // las variables NO ESTATICAS no pueden ser accedidas por un metodo estatico
        //como lo es el main, es necesario crear un objeto para que se reserve
        //espacio de memoria y asi poder utilizarlas en cualquier lado

        AprendiendoScope objeto1 = new AprendiendoScope();
        System.out.println("Valor de variable global 2: " + objeto1.globalVar2);
        objeto1.globalVar2 = objeto1.globalVar2 * 2;
        System.out.println("Valor de variable global 2: " + objeto1.globalVar2);
        objeto1.alterarVariableGlobal2();
        System.out.println("Valor de variable global 2: " + objeto1.globalVar2);


        //Probando variables locales
        int variableLocal = 10;

        if (true) {
            int variableLocal2 = 5;// error de compilacion la variable definida
            //dentro del bloque if pertenece al mismo scope que la variable local
            //definida fuera de este, las variables locales no se pueden repetir
        }

        //bloque anonimo
        {
            String variableLocal2 = "dentro de un bloque";
            System.out.println(variableLocal2);
        }

        String variableLocal2 = "fuera del bloque";

        //en este caso no hay problema por que el periodo de vida de la variable
        //definida dentro del bloque termina cuando la ejecucion del programa alcanza
        // el fin del bloque, de manera que el identificador puede ser utilizado nuevamente

        //otro ejemplo de esto es el uso repetido de identificadores en los ciclos
        for (int i = 0; i <= 10; i++) {

        }

        for (int i = 0; i <= 10; i++) {//esta variable i no es la misma del ciclo anterior
            //pero pueden existir debido a que su periodo de vida se limita al
            //cuerpo de cada ciclo
        }

        //bloque anonimo
        {
            String variableLocal3 = "dentro de un bloque";
        }

        //System.out.println(variableLocal3);//error de compilación
        //finalmente, la variable local 3 solo existe dentro del bloque en el
        //que se definió por ello no puede ser utilizada fuera de este

    }

    static void alterarVariableGlobal() {
        globalVar1 = 20;
    }

    void alterarVariableGlobal2() {
        globalVar2 = 20;
        //las variables NO ESTATICAS pueden ser utilizadas desde metodos 
        //NO ESTATICOS aun si no se ha creado un objeto.
    }
}
