package Grupal;
import java.util.Scanner;

public class Mayor {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el numero de elementos ");
        int n = sc.nextInt();
        int[] Arreglo = new int[n];

        for (int indice = 0; indice < Arreglo.length; indice++) {
            System.out.println("Ingrese el elemento");
            Arreglo[indice] = sc.nextInt();

        }
        for (int indice = 0; indice < Arreglo.length; indice++) {

            System.out.print(Arreglo[indice] + " ");
        }

        int mayor = Arreglo[0];
        for (int indice = 1; indice < Arreglo.length; indice++) {
            if (Arreglo[indice] > mayor) {
                mayor = Arreglo[indice];
            }
        }
        System.out.println("El mayor es: " + mayor);

    }
}

