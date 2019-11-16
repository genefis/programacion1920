package introjava;

/*
 Esta clase va a servir para trabajar con las distintas clases de operadores
 */
/**
 * @author Salas
 */
public class Operadores {

    public static void main(String[] args) {
        // 1. operadores aritmeticos 
        System.out.println("*****OPERADORES ARITMETICOS**** ");
        int suma = 14 + 14;
        int resta = 20 - 10;
        double multiplicacion = 50 * 0.12;
        int division = 100 / 50;
        int residuo = 7 % 2;
        System.out.println("La suma es:" + suma);
        System.out.println("La suma es:" + resta);
        System.out.println("La suma es:" + multiplicacion);
        System.out.println("La suma es:" + division);
        System.out.println("La suma es:" + residuo);

        // 2. operadores de incremento y decremento
        int nota = 15;
        nota = nota + 1 ;
        System.out.println("****OPERADORES DE INCREMENTO*****");
        System.out.println("incremento como nota = nota+1 :----"+ nota);
        System.out.println("incremento como nota +=1:----"+nota);
        System.out.println("incremento como nota ++:----"+nota);
        
        nota = nota -1;
        System.out.println("decremento como nota -= 1:----"+nota);
        
        nota--;
        System.out.println("decremento como nota = nota --:----"+nota);
        
        
    }
}
