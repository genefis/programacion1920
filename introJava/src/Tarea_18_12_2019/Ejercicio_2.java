
package Tarea_18_12_2019;

import java.util.Scanner;
public class Ejercicio_2 {
  public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numero[] = new int[5];
        
        for (int indice = 0; indice < numero.length; indice++) {
            System.out.println("Ingrese un valor");
            numero[indice] = teclado.nextInt();

        }
        int mayor;
        int menor;
        
        mayor = menor = numero [0];
        
        for (int indice = 0; indice < numero.length; indice++) {

            if (numero[indice] > mayor) {
                mayor = numero[indice];
            }
            if (numero[indice] < menor) {
                menor = numero[indice];

            }
        }
        System.out.println("La  mayor venta fue de: " + mayor);
        System.out.println("La menor venta fue de: " + menor);
    }  
}
