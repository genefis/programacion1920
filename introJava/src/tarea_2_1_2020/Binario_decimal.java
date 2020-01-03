package tarea_2_1_2020;

import java.util.Scanner;

public class Binario_decimal {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int termino = 0;
        int suma = 0;
        int bin = 0;

        System.out.println("Ingrese el numero de elementos");
        int n = entrada.nextInt();
        int[] binario = new int[n];
        for (int i = binario.length - 1; i >= 0; i--) {
            System.out.println("Ingrese un valor");
            binario[i] = entrada.nextInt();
        }

        for (int i = binario.length - 1; i >= 0; i--) {
            bin = (binario[i] * 2 ^ i);
            termino = termino + bin;
            System.out.print("El termino ingresado es: " + binario[i] + ":la poscion es:" + i);
System.out.println("");
        }

        
        System.out.print("El numero decimal es:" + termino);

    }
}
