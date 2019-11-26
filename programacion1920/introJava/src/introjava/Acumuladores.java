
package introjava;


public class Acumuladores {
    public static void main(String[] args) {
        System.out.println("Trbajando con acumuladores");
        int contador =1;
        int acumulador=1;
        while(contador <=5){
            acumulador = acumulador * contador;
            
               
            contador++;
        }
         System.out.println(+contador);
        System.out.println(+acumulador);
    }
}
