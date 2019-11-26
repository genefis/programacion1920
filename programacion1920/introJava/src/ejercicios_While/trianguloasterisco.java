/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios_While;

import java.util.Scanner;


public class trianguloasterisco {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int contador = 1;
        String asterisco ="*";
        System.out.println("Ingrese un numero");
        int num = sc.nextInt();
                
        while (contador <=num){
            asterisco = asterisco+ "*";
            System.out.println(asterisco);  
            contador=contador+1;
        }
        
    }
}

