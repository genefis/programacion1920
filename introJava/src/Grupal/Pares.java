
package Grupal;

import java.util.Scanner;


public class Pares {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int arreglo[] = new int[20];
        int cont = 0;
        int n = 0;
        System.out.println("escriba un numero");
        int num = teclado.nextInt();
        num = num * 2;

        for (int i = 0; i < arreglo.length; i++) {
            for (int j = 1; j <= num; j++) {
                if (j % 2 == 0) {
                    n = j;
                    arreglo[i] = n;
                    System.out.print(" " + arreglo[i]);
                }
            }
        }
        
    }
}
