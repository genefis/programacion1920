/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package introjava.Tarea_04;

import java.util.Scanner;

public class Costo_pedido {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("COSTO DEL PEDIDO");
        System.out.println("Ingrese el nombre o descripcion  del articulo");
        String descripcion = sc.nextLine();

        System.out.println("***********Presione enter***********");
        sc.nextLine();
        System.out.println("Ingrese la cantidad de pedidos a realizar:");
        int cantidad = sc.nextInt();
        System.out.println("Ingrese el precio unitario por artículo ");
        double unitario = sc.nextDouble();
        double precio = cantidad * unitario;
        System.out.println("El precio del articulo: " + descripcion + "\tes: " + precio + " dolares");

    }
}
