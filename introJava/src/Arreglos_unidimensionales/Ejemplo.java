package Arreglos_unidimensionales;

public class Ejemplo {

    public static void main(String[] args) {
        String Universidades[] = {"utpl", "unl", "UCuenca"};
        //System.out.println(Universidades[0]);
        //System.out.println(Universidades[1]);
        //System.out.println(Universidades[2]);
        String Estudiantes[] = new String [20];
        Estudiantes[10]="Genesis";
        Estudiantes[19]="Genesis";
        Estudiantes[0]="Genesis";
        for(int indice =0;indice<Estudiantes.length;indice++){
            System.out.println("Estudiantes["+indice+"] = "+Estudiantes[indice]);
        }
        //for(int indice =0;indice<Universidades.length;indice++){
        //    System.out.println(Universidades [indice]);
        // }
    }
}
