package Ejercicios_proyecto;

import java.util.Scanner;

public class Numero_perfecto {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = 1;

        int perfectos = 0;
        int div = 0;
        System.out.println("Ingrese el numero de elementos");
        int num = sc.nextInt();

        while ((i >= 1) & (num == 100)) {
            if (num % i == 0) {
                perfectos = perfectos + i;
            }
            if (perfectos ==num){
                perfectos=num;
            }
            num = num - 1;
            i = i + 1;

        }
        System.out.println(+perfectos);

    }
}
