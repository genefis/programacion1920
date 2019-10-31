package introjava.Tarea_04;

import java.util.Scanner;

public class Valores_y {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("VALORES DE LA COMPONENTE Y ");
        System.out.println("Ingrese el valor de la componente X");
        double x = sc.nextDouble();
        double y;
        if (x < 0) {
            y = 3 * (x) + 6;
         } else {
            y = (x * x) + 6;
        }
        System.out.println("x =\t" + x);
        System.out.println("Y =\t" + y);
        
    }
}

