
package Tarea_18_12_2019;

import java.util.Scanner;
public class Ejercicio_8 {
   public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int num[] = new int[25];
        int aux = 0;
        int cero =0;
        int mayor =0;
        int menor=0;
        for (int i = 0; i < num.length; i++) {
            System.out.println("ingrese numeros");
            num[i] = teclado.nextInt();

        }
        for (int i = 0; i < num.length; i++) {
            if (num[i]==0) {
                cero=cero+1;
                
                
            }else{
                if (num[i]>0) {
                    mayor=mayor+1;
                    
                    
                    
                }else{
                    if (num[i]<0) {
                        menor=menor+1;
                        
                    }
                }
            } 
           
            
        }
         System.out.println("los numeros igual a cero son: "+cero);
         System.out.println("los numeros menores a cero son: "+menor);
         System.out.println("los numeros mayores acero son: "+mayor);
        
    }

} 

