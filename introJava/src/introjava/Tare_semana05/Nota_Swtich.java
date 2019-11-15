package introjava.Tare_semana05;

import java.util.Scanner;

public class Nota_Swtich {

        public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        String opcion;
        System.out.println("INGRESE EL RANGO EN QUE SE ENCUENTRA SU NOTA");
        System.out.println(" 1:(0-4)");
        System.out.println(" 2:(5-6)");
        System.out.println(" 3:(7-8)");
        System.out.println(" 4:(9-10)");
        opcion = entrada.next();
        switch (opcion){
              case "1": System.out.println("Insuficiente");break;
              case "2":System.out.println("Suficiente");break;
              case "3":System.out.println("Bien");break;
              case "4":System.out.println("Notable");break;
              default:System.out.println("+Nota Invalida+");
            }
    }           
    }




