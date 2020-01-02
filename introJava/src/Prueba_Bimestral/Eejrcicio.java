//
package Prueba_Bimestral;

import java.util.Scanner;

public class Eejrcicio {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = 1;

        System.out.println("DIVISION ENTERA");
        System.out.println("Ingrese un numero(Dividendo)");
        int n1 = sc.nextInt();
        System.out.println("Ingrese un numero(Divisor)");
        int n2 = sc.nextInt();
        int respuesta = n1;

        if (n1 >= n2) {
            int total = 0;
            while ((i >= 1) & (respuesta >= n2)) {
                respuesta = respuesta - n2;

                total = i;

                i = i + 1;
            }
            System.out.println("la respuesta es " + total);

        } else {
            System.out.println("Ingrese el numero nuevamente:"
                    + "El dividendo debe ser mayor");
        }

    }
}
