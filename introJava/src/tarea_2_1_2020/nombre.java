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
public class nombre {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el tamaño de filas");
        int fila = sc.nextInt();
        sc.nextLine();
        System.out.println("ingrese numero de columnas");
        int columnas = sc.nextInt();
        sc.nextLine();
        String nombres[][] = new String[fila][columnas];
        for (fila = 0; fila < nombres.length; fila++) {
            int tam_col = nombres[fila].length;
            for (columnas = 0; columnas < tam_col; columnas++) {
                System.out.print("Ingrese nombre");
                String valor = sc.nextLine();
                nombres[fila][columnas] = valor;

            }

        }
        System.out.println("Ingrese el nombre que desea buscar ");
        String nombre = sc.nextLine();
        
    }
}