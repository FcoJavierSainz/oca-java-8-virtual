package modulo5;

/**
 * Created by JavierSainz on 6/18/16.
 */
public class BusquedaMatriz {
    public static boolean encuentraNumero(int[][] matriz,
                                          int numeroAEncontrar) {
        if (matriz == null || matriz.length == 0) {
            return false;
        }
        if (matriz.length != matriz[0].length) {
            return false;
        }
        boolean encontrado = false;
        int renglon = 0;
        int columna = matriz[renglon].length - 1;
        while (renglon < matriz.length && columna >= 0) {
            if (matriz[renglon][columna] == numeroAEncontrar) {
                encontrado = true;
                break;
            }
            if(matriz[renglon][columna] > numeroAEncontrar) {
                columna--;
            } else {
                renglon++;
            }
        }
        return encontrado;
    }

    public static void main(String[] args) {
        int[][] matriz = {
                {1, 2, 8, 9},
                {2, 4, 9, 12},
                {4, 7, 10, 13},
                {6, 8, 11, 15}
        };
        System.out.println(encuentraNumero(matriz, 3));
    }
}
