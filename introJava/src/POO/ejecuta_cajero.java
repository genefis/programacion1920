package POO;

import java.util.Scanner;

/**
 *
 * @author UTPL
 */
public class ejecuta_cajero {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese el saldo inicial de la cuenta");
        int saldo_inicial = teclado.nextInt();
        Cajero cajero = new Cajero(saldo_inicial);
        teclado.nextLine();
        int opcion=0;
        while (opcion!=4) {
            System.out.println("    CAJERO AUTOMATICO UTPL     ");
            System.out.println("Dijite 1: para retirar.........");
            System.out.println("Dijite 2: para depositar.......");
            System.out.println("Dijite 3:para consultar_saldo..");
            System.out.println("Dijute 4: para salir...........");
            System.out.println("-------------------------------");
            opcion = teclado.nextInt();
            teclado.nextLine();

            switch (opcion) {
                case 1:
                    System.out.println("Ingrese un valor aretirar");
                    int valor_retiro = teclado.nextInt();
                    teclado.nextLine();
                    cajero.retirar(valor_retiro);
                    System.out.println("Saldo Contable:" + cajero.consultar_saldo());

                    break;
                case 2:

                    System.out.println("Ingrese un valor a depositar");
                    int valor_deposito = teclado.nextInt();
                    cajero.depositar(valor_deposito);

                    break;
                case 3:
                    System.out.println("**SALDO DE LA CUENTA**" + cajero.consultar_saldo());
                    break;
                case 4:
                    System.out.println("Gracias por preferirnos");
                    break;
                default:
                    System.out.println("opcion invalida");
            }
        }

    }
}
