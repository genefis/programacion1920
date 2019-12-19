/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tarea_18_12_2019;

import java.util.Scanner;

public class Binario_decimal {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int termino = 0;
        int suma = 0;
        int i = 0;

        System.out.println("Ingrese el numero de elementos");
        int n = entrada.nextInt();
        int[] binario = new int[n];
        for (i = 0; i < binario.length; i++) {
            System.out.println("Ingrese un valor");
            binario[i] = entrada.nextInt();
            System.out.print(binario[i] + ":");
        }
        int j = binario.length - 1;
        for (i = 0; i < binario.length; i++) {

            termino = termino + (binario[i] * 2 ^ j);// = 2 // 1
            j = j - 1;
        }

        System.out.println("");
        System.out.print("El numero decimal es:" + termino);

    }
}
