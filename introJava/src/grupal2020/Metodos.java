package grupal2020;

import static java.lang.Math.PI;
import java.util.Scanner;

public class Metodos {

    public static void main(String[] args) {
        System.out.println("AREA DEL CIRCULO");
        System.out.println("Ingrese el radio del circulo");
        Scanner entrada = new Scanner(System.in);
        double radio = entrada.nextDouble();
        double area = area_circulo(radio);

        System.out.println("AREA DEL TRIANGULO");
        System.out.println("Ingrese la base");
        double base = entrada.nextInt();
        System.out.println("Ingrese la altura");
        double altura = entrada.nextInt();
        area_triangulo(base, altura);

    }

    /**
     * Este metodo sirve para calcular el radio de un circulo Este metodO
     * retorna valor
     *
     * @param args
     */

    public static double area_circulo(double radio) {
        double area = 0;
        area = Math.pow((radio * PI), 2);
        System.out.println(area);
        return area;
    }

    /**
     * Este metodo sirve para calcular el area de un triangulo; Este metodo no
     * retorna valor
     */
    public static void area_triangulo(double base, double altura) {
        double triangulo = 0;
        double area = (base * altura) / 2;
        System.out.println("La altura es: " + area);

    }

}
