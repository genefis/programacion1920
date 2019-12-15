package Tarea_06;

import java.util.Scanner;

public class Serie_2 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int i = 0;
        int den = 0;
        int num = 1;
        System.out.println("Ingrese el numero de fracciones deseadas");
        int n = entrada.nextInt();
        while (i < n) {

            den = den + 1;
            
            i = i + 1;
            System.out.print("+  "+num + "/" + den);
        }

    }

}
