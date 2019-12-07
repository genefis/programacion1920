package Ejercicios_proyecto;

import java.util.Scanner;

public class promedio {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double suma = 0;
        int i = 0;
        double prom = 0;
        boolean bander = true;
        do {
            System.out.println("¿DESEA INGRESAR OTRO NUMERO?:SI(1);NO (2)");
            int opcion = sc.nextInt();
            if (opcion == 1) {
                i = i + 1;
                System.out.println("INGRESE UN NUMERO");
                double num = sc.nextDouble();
                suma = suma + num;
                prom = suma / i;
            } else {
                bander = false;
            }
        } while (bander == true);
        System.out.println("El promedio es " + prom);
    }

}
