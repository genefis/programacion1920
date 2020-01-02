
package tarea_2_1_2020;

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
        for (i = binario.length-1; i >=0; i--) {
            System.out.println("Ingrese un valor");
            binario[i] = entrada.nextInt();
            System.out.print(binario[i] + ":");
        }
        
        for (i = binario.length-1; i >=0; i--) {

            termino = termino + (binario[i] * 2 ^ i);
          
        }

        System.out.println("");
        System.out.print("El numero decimal es:" + termino);

    }
}
