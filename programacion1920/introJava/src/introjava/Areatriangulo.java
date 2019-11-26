package introjava;

import java.util.Scanner;

public class Areatriangulo {

    public static void main(String[] args) {
        double base;
        double altura;
        System.out.println("----AREA DEL TRIANGULO----");
        Scanner entrada = new Scanner(System.in);
        System.out.println("INGRESE EL VALOR DE LA BASE EN CM");
        base = entrada.nextDouble();
        System.out.println("INGRESE EL VALOR DE LA ALTURA EN CM");
        altura = entrada.nextDouble();
        double area = (base * altura) / 2;
        System.out.println("El ÁREA DEL TRIANGULO ES:" + area);
    }

}
