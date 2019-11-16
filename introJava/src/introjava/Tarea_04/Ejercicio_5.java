package introjava.Tarea_04;

import java.util.Scanner;

public class Ejercicio_5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Cuantas hojas de hielo seco desea");
        int hojas = sc.nextInt();
        System.out.println("ingrese el precio unitario de las hojas de hielo seco");
        double ph = sc.nextDouble();
        System.out.println("Cuantas viguetas desea ");
        int viguetas = sc.nextInt();
        System.out.println("Ingrese el valor unitario de las viguetas ");
        double pv = sc.nextDouble();
        System.out.println("Cuantos armazones desea");
        int armazones = sc.nextInt();
        System.out.println("Ingrese el valor unitario de los armazones");
        double pa = sc.nextDouble();
        double costo = ((hojas * ph) * (1 - 0.20)) + ((viguetas * pv) * (1 - 0.15)) + (armazones * pa);
        System.out.println("El costo subtotal de su compra es: " + costo);
        System.out.println("****Ingrese la forma de pago*****");
        System.out.println("1. Contado");
        System.out.println("2. Tarjeta de credito");
        int n = sc.nextInt();
        double precio;
        if (n > 0 & n < 2) {
            precio = costo * (1 - 0.07);
            System.out.println("El costo total del producto es " + precio);
        } else {
            precio = costo;
            System.out.println("El costo total del producto es " + precio);
        }
    }

}
