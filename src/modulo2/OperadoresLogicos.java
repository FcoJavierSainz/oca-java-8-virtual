package modulo2;

public class OperadoresLogicos {
    public static void main(String[] args) {

        boolean aprueboExamenes = true;
        boolean tareasCompletas = true;
        boolean cursoAprobado = false;


        cursoAprobado = aprueboExamenes && tareasCompletas;

        //Una forma de representar el anterior caso
        if (aprueboExamenes && tareasCompletas) {
            cursoAprobado = true;
            System.out.println("Felicidades !!");
        }

        //Esta es otra forma de representar el anterior caso
        if (aprueboExamenes == true && tareasCompletas == true) {

        }

        //Otra forma :)
        if (aprueboExamenes != false && tareasCompletas != false) {
        }


        boolean titulacion = false;
        boolean examenAprobado = true;
        boolean tesisTerminada = true;
        boolean promedioAlto = true;

        //Una forma de representar el anterior caso
        if (tesisTerminada || examenAprobado || promedioAlto) {
            titulacion = true;
            System.out.println("Felicidades !!");
        }

    }
}
