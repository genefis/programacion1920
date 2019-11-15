package introjava.Tare_semana05;

import java.util.Scanner;

public class Mayor_Menor {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("INGRESE LOS NUMEROS A COMPARAR");
        System.out.println("Ingrese un numero");
        int n1 = entrada.nextInt();
        System.out.println("Ingrese un numero");
        int n2 = entrada.nextInt();
        if (n1 == n2) {
            System.out.println("Son iguales");
        } else if (n1 < n2) {
            System.out.println("El numero" + n1 + "es menor que " + n2 );
        } else if (n2 < n1) {
            System.out.println("El numero " + n2 + "es menor que" + n1 );
        }
    }
}
