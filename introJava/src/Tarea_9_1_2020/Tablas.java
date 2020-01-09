package Tarea_9_1_2020;

import java.util.Scanner;

public class Tablas {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("OPERACIONES BÁSICAS");
        System.out.println("Escoja que operacion desea mostrar");
        System.out.println("1.Tablas de sumar");
        System.out.println("2.Tablas de multiplicar");
        System.out.println("3.Tablas de restar");
        System.out.println("4.Tablas de dividir");
        int opcion = entrada.nextInt();
        int repeticiones = 9;
        int num = 0;
        switch (opcion) {
            case (1):

                Menu(repeticiones);
                System.out.println("Escriba que tabla desea");
                num = entrada.nextInt();
                System.out.println("La tabla del" + num + "es" + suma(num));
                break;
            case (2):
                Menu(repeticiones);
                System.out.println("Escriba que tabla desea");
                num = entrada.nextInt();
                System.out.println("La tabla del" + num + "es" + multiplicacion(num));
                break;
            case (3):

                Menu(repeticiones);
                System.out.println("Escriba que tabla desea");
                num = entrada.nextInt();
                System.out.println("La tabla del" + num + "es" + resta(num));
                break;
            case (4):
                Menu(repeticiones);
                System.out.println("Escriba que tabla desea");
                num = entrada.nextInt();

                System.out.println("La tabla del" + num + "es" + division(num));
                break;
        }

    }

    public static void Menu(int n) {
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }

    }

    public static int suma(int num) {
        int suma = 0;
        for (int i = 0; i < 10; i++) {
            suma = num + i;

        }
        return suma;
    }
    public static int multiplicacion(int num) {
        int multiplicacion= 0;
        for (int i = 0; i < 10; i++) {
            multiplicacion= num * i;

        }
        return multiplicacion;
    }
    public static int resta(int num) {
        int resta= 0;
        for (int i = 0; i < 10; i++) {
            resta= i-num;

        }
        return resta;
    }
    public static int division(int num) {
        int division= 0;
        for (int i = 0; i < 10; i++) {
            division= i/num;

        }
        return division;
    }
}
