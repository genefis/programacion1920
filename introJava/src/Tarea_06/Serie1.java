package Tarea_06;

import java.util.Scanner;

public class Serie1 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int cont = 1;
        String cadena ="";
        System.out.println("ingrese el tamaño de la serie");
        int n = entrada.nextInt();
        while (cont <= n) {
            cadena = cadena + cont;
            cont = cont + 1;
            
            System.out.println(cadena);
            
        }
    }
}
