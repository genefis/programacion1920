package ejercicios_While;

import java.util.Scanner;

public class MultiplicacionConSumas {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int contador = 1;
        double elemento = 0;
        System.out.println("MULTIPLICAION POR SUMAS");
        System.out.println("Ingrese un numero");
        double n1 = sc.nextDouble();
        System.out.println("Ingrese un numero");
        double N2 = sc.nextDouble();

        while (contador <= n1) {
            elemento = elemento + N2;
            contador=contador+1;
        }
        System.out.println(+elemento);
    }
}
