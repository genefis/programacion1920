package introjava.Tarea_04;

import java.util.Scanner;

public class Precio_terreno {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" PRECIO DE UN TERRENO");
        System.out.println(" Ingresar el ancho del terreno en m");
        double ancho = sc.nextDouble();
        System.out.println("Ingrese el largo del terreno en m");
        double largo = sc.nextDouble();
        System.out.println(" Ingrese el precio por m^2");
        double M2 = sc.nextDouble();
        double Area = ancho * largo;
        double precio = M2 * Area;
        if (Area > 400) {
             precio = precio * (1 - 0.10);
        }
        System.out.println("El precio del terreno es"+precio);
    }
}
