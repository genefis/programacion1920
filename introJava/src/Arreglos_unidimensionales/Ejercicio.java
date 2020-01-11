package Arreglos_unidimensionales;

public class Ejercicio {

    public static void main(String[] args) {
        int numeros[] = {2, 3, 4, 2, 4, 5, 6, 2, 1, 2};
        int cuadrados[] = new int[numeros.length];
        //Arrgelo para almacenar el proceso de la operacion
        
        
        String procesos[] = new String[numeros.length];
        for (int indice = 0; indice < numeros.length; indice++) {
            int cuadrado = numeros[indice] * numeros[indice];
            cuadrados[indice] = cuadrado;
            //concatena los valores
            procesos[indice] = numeros[indice] + "x" + numeros[indice];
            // ciclo de repeticion para imprimir 3 arreglos

        }
        
        String print_numeros = "numeros   =";
        String print_cuadrados ="cuadrados =";
        String print_procesos = "procesos  =";
        for (int indice = 0; indice < numeros.length; indice++) {
            print_numeros = print_numeros + numeros[indice] + ",";
            print_cuadrados = print_cuadrados + procesos[indice] + ",";
            print_procesos = print_procesos + cuadrados[indice] + ",";
        }
        System.out.println(print_numeros);
        System.out.println(print_cuadrados);
        System.out.println(print_procesos);
    }
}
