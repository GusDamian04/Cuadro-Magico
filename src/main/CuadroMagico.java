package main;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import methods.Methods;

public class CuadroMagico {

    public static void main(String[] args) throws Exception {
        BufferedReader bufer = new BufferedReader(new InputStreamReader(System.in));
        String entrada;
        

        boolean b;
        int[][] a;
        int r1, c1;

        Methods methods = new Methods();

        System.out.println("***Programa para Cuadro Magico***");
        System.out.println("Escribe las filas de la matriz: ");
        entrada = bufer.readLine();
        r1 = Integer.parseInt(entrada);
        System.out.println("Escribe las columnas");
        entrada = bufer.readLine();
        c1 = Integer.parseInt(entrada);

        a = new int[r1][c1];

        if(r1 == c1){
            a = methods.leerMatriz(r1, c1);
            methods.imprimirMatriz(a);
            b = methods.esCuadroMagico(a);
            if(b == true){
                System.out.println("Tu matriz es cuadro magico :)");
            } else {
                System.out.println("Tu matriz no es cuadro magico :(");
            }
        } else {
            System.out.println("Tu matriz no es cuadrada :(");
        }
    }
}
