package introjava.Tarea_04;

import java.util.Scanner;

public class Formula_cuadratica {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("*****FÓRMULA CUADRATICA*****");
        System.out.println("Ingrese el coeficiente de  a");
        double a = sc.nextDouble();
        System.out.println("Ingrese el coeficiente de b");
        double b = sc.nextDouble();
        System.out.println("Ingrese el coeficiente de c");
        double c = sc.nextDouble();
        double n;
        n = (b * b) - (4 * a * c);
        double x1;
        x1 = (-(b) + (Math.sqrt(n))) / (2 * a);
        double x2;
        x2 = (-(b) - (Math.sqrt(n))) / (2 * a);
        System.out.println("El resultado es x=" + x1 );
        System.out.println("El resultado es x=" + x2 );
    }
}
