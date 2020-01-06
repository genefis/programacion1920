/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea_2_1_2020;

import java.util.Scanner;

/**
 *
 * @author UTPL
 */
public class multiplicacion {

        public static void main(String[] args) {
        int[][] a = new int[3][3];
        int[][] b = new int[3][3];
        int[][] c = new int[3][3];
        int indice, j;

        Scanner teclado = new Scanner(System.in);

        System.out.println("Datos de la Matriz A :");

        for (indice = 0; indice <= 2; indice++) {
            for (j = 0; j <= 2; j++) {
                System.out.print("Escribir valor " + indice + " , " + j + " : ");
                a[indice][j] = teclado.nextInt();
            }
        }

        System.out.println("Datos de la Matriz B :");

        for (indice = 0; indice <= 2; indice++) {
            for (j = 0; j <= 2; j++) {
                System.out.print("Escribir valor " + indice + " , " + j + " : ");
                b[indice][j] = teclado.nextInt();
            }
        }

        for (indice = 0; indice <= 2; indice++) {
            for (j = 0; j <= 2; j++) {
                c[indice][j] = a[indice][j] * b[indice][j];
            }
        }

        System.out.println("Matriz resultante de la multiplicación :");
        for (indice = 0; indice <= 2; indice++) {
            for (j = 0; j <= 2; j++) {
                System.out.print(c[indice][j] + " ");
            }
            System.out.println("");

        }
    }

    
}

