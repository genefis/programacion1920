package ejercicios_While;

import java.util.Scanner;

public class CajeroautomaticoWhile {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el saldo de su cuenta");
        double saldo = sc.nextDouble();
            // boolean nuevo_numero = true;
        int opcion = 0;
           //  while (nuevo_numero == true) {
        while (opcion != 4) {
            System.out.println("***INGRESE LA OPCION QUE DESEE***");
            System.out.println("1.Desea hacer un deposito--------");
            System.out.println("2. Desea hacer un retiro---------");
            System.out.println("3.Presentar el saldo en la cuenta");
            System.out.println("4. Finalizar el programa---------");
            opcion = sc.nextInt();

            switch (opcion) {
                case (1):
                    System.out.println("Ingrese cuanto desea depositar");
                    double deposito = sc.nextDouble();
                    if (deposito > 0) {
                        saldo = saldo + deposito;
                    } else {
                        System.out.println("****VALOR INVALIDO****");
                    }

                    break;
                case (2):
                    System.out.println("Ingrese cuanto desea retirar");
                    double retiro = sc.nextDouble();

                    if (retiro <= saldo) {
                        saldo = saldo - retiro;

                    } else {
                        System.out.println("***VALOR INVALIDO*****");
                    }
                    break;
                case (3):
                    System.out.println("El SALDO DE SU CUENTA ES:  "+saldo);
                    break;
//                case (4):
//                    nuevo_numero = false;
//                    break;

            }

        }
    }
}
