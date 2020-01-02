/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tarea_18_12_2019;

import java.util.Scanner;

public class Ejercicio_3 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        int numero[] = new int[30];
        int i;

        for (int in = 0; in < numero.length; in++) {
            System.out.println("Ingrese el numero");
            numero[in] = teclado.nextInt();
        }
        int mayor = 0;
        int menor = 0;
        int rep1 = 0;
        int rep2 = 0;

        mayor = menor = numero[0];;

        for (int in = 0; in < numero.length; in++) {
            if (numero[in] == mayor) {
                rep1++;

            }
            if (numero[in] == menor) {
                rep2++;
            }

            if (numero[in] > mayor) {

                mayor = numero[in];

            }
            if (numero[in] < menor) {

                menor = numero[in];

            }

        }
        System.out.println("La mayor venta fue de: " + mayor);
        System.out.println("La menor venta fue de: " + menor);
        System.out.println("numero mayor se repite: " + rep1);
        System.out.println("numero menor se repite: " + rep2);

    }
}
