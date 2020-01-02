package Ejercicios_for;

import java.util.Scanner;

public class Puente_2d {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese la distancia del puente ");
        int distancia_puente = entrada.nextInt();
        System.out.println("Ingrese la altura de las columnas");
        int alto_columna = entrada.nextInt();
        System.out.println("Ingrese la distancia entre columnas");
        int distancia_entre_col = entrada.nextInt();

        System.out.println("");
        for (int fila = 0; fila <= alto_columna; fila++) {
            for (int col = 1; col < distancia_puente; col++) {
                if (fila==0){
                    System.out.print("- ");
                }else if (col % (distancia_entre_col + 1) == 0) {
                    System.out.print("* ");
                } else {
                    System.out.print(" ");
                }

            }
            System.out.println("");
        }
    }

}
