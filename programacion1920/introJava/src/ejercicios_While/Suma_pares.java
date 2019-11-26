
package ejercicios_While;

public class Suma_pares {

    public static void main(String[] args) {
        int i = 2;
        int suma = 0;
        while (i <= 100) {
            suma = suma + i;
                System.out.println(+i);    
            i = i + 2;
        }
        System.out.println("LA SUMA ES: " + suma);
    }
}
