package Metodos;

public class metodo {

    public static void main(String[] args) {
        // llamamos al metodo pasando las variables
        //saludar_n_veces("genesis", 12);
        int resultado = suma_dos_numeros (10,7);
        System.out.println("el rrsultado de la suma es"+resultado);
        int resultado2 = suma_dos_numeros (1,2);
        System.out.println("el resultado d ela suma es "+ resultado2);

    }

    /**
     * METODO QUE NO RETONA VALOR
     * @param nombre
     * @param n_veces
     */

    public static void saludar_n_veces(String nombre, int n_veces) {
        for (int i = 0; i < n_veces; i++) {
            System.out.println("Feliz año 2020:" + nombre);
        }
    }
 /**
  * METODO QUE SI TERONAR VALOR
  * @param n1
  * @param n2
  * @return 
  */
    public static int suma_dos_numeros(int n1, int n2) {
        int suma =0;
        suma = n1+ n2 ;
        return suma ;
    }
}
