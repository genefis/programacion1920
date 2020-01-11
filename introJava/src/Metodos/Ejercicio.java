package Metodos;

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
        String print_cuadrados = "cuadrados =";
        String print_procesos = "procesos  =";
        for (int indice = 0; indice < numeros.length; indice++) {
            print_numeros = print_numeros + numeros[indice] + ",";
            print_cuadrados = print_cuadrados + procesos[indice] + ",";
            print_procesos = print_procesos + cuadrados[indice] + ",";
        }
        System.out.println(print_numeros);
        System.out.println(print_cuadrados);
        System.out.println(print_procesos);
        // suma solo de numeros  pares
        int acumulador_pares = 0;
        for (int indice = 0; indice < numeros.length; indice++) {

            if (detectar_par(numeros[indice]) == true) {//significa if (par ==true)
                acumulador_pares = acumulador_pares + numeros[indice];
            }
        }
        System.out.println("La suma de los numeros pares es:" + acumulador_pares);
    }

    /**
     * Metodo para verificar si un numero dado es par o no
     *
     * @param numero
     * @return
     */
    public static boolean detectar_par(int numero) {
        boolean resultado = false;
        if (numero % 2 == 0) {
            resultado = true;
        }
        return resultado;
    }
    
}  