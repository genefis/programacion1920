
package Tarea_18_12_2019;
import java.util.Scanner;
public class Ejercicio_1 {
   
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Cuantos nombres desea ingresar");
        int n= entrada.nextInt();
        String nombre[] = new String [n];
        
        for (int i = 0; i < nombre.length; i++) {
            System.out.println("INGRESE EL NOMBRE");
            nombre[i] = entrada.next();
        }
        
        System.out.println("Ingrese el numero de nombre que desea mostrar ");
        int opcion= entrada.nextInt();
        System.out.println("El nombre es: "+nombre[opcion]);

    }
}

