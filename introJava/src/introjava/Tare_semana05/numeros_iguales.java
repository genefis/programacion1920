package introjava.Tare_semana05;

import java.util.Scanner;

public class numeros_iguales {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("INGRESE LOS NUMEROS A COMPARAR");
        System.out.println("Ingrese un numero");
        int n1 = entrada.nextInt();
        System.out.println("Ingrese un numero");
        int n2 = entrada.nextInt();
        if (n1 == n2) {
            System.out.println("Son iguales");
        } else {
            System.out.println("No son iguales");
        }
    }
}