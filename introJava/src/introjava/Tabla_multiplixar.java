/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package introjava;

import java.util.Scanner;


public class Tabla_multiplixar {
    public static void main(String[] args) {
        System.out.println("Generacion de tabla de ");
        System.out.println("Ingrese numero para elaborar tabla de multiplicar");
        Scanner entrada = new Scanner(System.in);
        int numero = entrada. nextInt();
        int cnt =1;
        while(cnt<=10){
            System.out.println("numero "+cnt+"="+numero*cnt);
            cnt++;
        
    }
    } 
    
   
    
}
