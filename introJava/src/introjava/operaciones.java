package introjava;

import java.util.Scanner;

public class operaciones {

    public static void main(String[] args) {
        double numero1;
        double numero2;

        Scanner entrada = new Scanner(System.in);
        System.out.println("------OPERACIONES ARITMETICAS------");
        System.out.println("INGRESE UN NUMERO");
        numero1 = entrada.nextDouble();
        System.out.println("INGRESE UN NUMERO");
        numero2 = entrada.nextDouble();
        double suma = numero1 + numero2;
        System.out.println("LA SUMA ES:" + suma);
        double mul = numero1 * numero2;
        System.out.println("LA MULTIPLICACIÓN ES:" + mul);
        double division = numero1 / numero2;
        System.out.println("LA DIVISIÓN ES:" + division);
        double resto = numero1 % numero2;
        System.out.println("EL RESTO ES:" + resto);
    }
}
