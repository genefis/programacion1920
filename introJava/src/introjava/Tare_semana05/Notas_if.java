package introjava.Tare_semana05;

import java.util.Scanner;

public class Notas_if {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("INGRESE LA NOTA TOTAL");
        int nota = entrada.nextInt();
        if (nota >= 0 & nota <= 4) {
            System.out.println(" Insuficiente");
        } else if (nota >= 5 & nota <= 6) {
            System.out.println(" Suficiente");

        } else if (nota >= 7 & nota <= 8) {
            System.out.println("bien");

        } else if (nota >= 9 & nota <= 10) {
            System.out.println("Notable");
        } else {
            System.out.println("***Nota invalida****");
        }
    }
}
