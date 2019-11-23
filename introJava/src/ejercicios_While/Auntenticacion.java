package ejercicios_While;

import java.util.Scanner;

public class Auntenticacion {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String usuario = "Genefis";
        String password = "hola1234";

        boolean autenticacion = false;
        while (!autenticacion) {
            System.out.println("INGRESE SU USUARIO Y CLAVE");
            String usuario_t = sc.next();
            String pass = sc.next();
            if (usuario.equals(usuario_t) && password.equals(pass)) {
                System.out.println("Bienvenido al sistema");
                autenticacion = true;
            } else {
                System.out.println("Auntenticacion incorrecta");
            }

        }

    }
}