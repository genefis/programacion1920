package ejercicios_While;

import java.util.Scanner;

public class Multiplicacion_numeros {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int acumulador = 1;
        boolean nuevo_numero =true;
        while (nuevo_numero == true) {
            System.out.println("Desea ingresar otro numero:si/no?");
            String opcion = sc.next();
            opcion=opcion.toLowerCase();
            if (opcion.equals("si")) {
                System.out.println("Ingrese el numero");
                int numero = sc.nextInt();
               acumulador = acumulador * numero;
            } else if (opcion.equals("no")) {
                nuevo_numero = false;
            }

        }
        System.out.println("La multiplicacion de los numeros es:"+acumulador);
    }
}
