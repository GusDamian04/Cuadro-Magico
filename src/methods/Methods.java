package methods;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Methods {
    public static BufferedReader bufer = new BufferedReader(new InputStreamReader(System.in));
    public static String entrada;
    
    public int[][] leerMatriz(int filas, int columnas) throws IOException{
        int[][] matriz = new int[filas][columnas];
        System.out.println("Lectura de datos  de la matriz");
        for(int i = 0; i < filas; i++){
            for(int j = 0; j < columnas; j++){
                System.out.print("Escribe el valor ["+ i +"]["+ j +"] -> ");
                entrada = bufer.readLine();
                matriz[i][j] = Integer.parseInt(entrada);
            }
            System.out.println("");
        }
        return matriz;
    }

    public void imprimirMatriz(int[][] matriz){
        System.out.println("Contenido de tu matriz");
        for(int i = 0; i < matriz.length; i++){
            for(int j = 0; j < matriz[0].length; j++){
                System.out.print(matriz[i][j] +"   ");
            }
            System.out.println("");
        }
    }

    public boolean esCuadroMagico(int[][] matriz) {
        int sumaFila = 0;
        // Suma de la primera fila
        for (int j = 0; j < matriz[0].length; j++) {
            sumaFila += matriz[0][j];
        }
        // Verificar las sumas de las filas
        for (int i = 1; i < matriz.length; i++) {
            int sumaActual = 0;
            for (int j = 0; j < matriz[0].length; j++) {
                sumaActual += matriz[i][j];
            }
            if (sumaActual != sumaFila) {
                return false;
            }
        }
        // Verificar las sumas de las columnas
        for (int j = 0; j < matriz[0].length; j++) {
            int sumaActual = 0;
            for (int i = 0; i < matriz.length; i++) {
                sumaActual += matriz[i][j];
            }
            if (sumaActual != sumaFila) {
                return false;
            }
        }
        // Verificar la suma de la diagonal principal
        int sumaDiagonalPrincipal = 0;
        for (int i = 0; i < matriz.length; i++) {
            sumaDiagonalPrincipal += matriz[i][i];
        }
        if (sumaDiagonalPrincipal != sumaFila) {
            return false;
        }
        // Verificar la suma de la diagonal secundaria
        int sumaDiagonalSecundaria = 0;
        for (int i = 0; i < matriz.length; i++) {
            sumaDiagonalSecundaria += matriz[i][matriz.length - 1 - i];
        }
        if (sumaDiagonalSecundaria != sumaFila) {
            return false;
        }
        return true;
    }
    
}
