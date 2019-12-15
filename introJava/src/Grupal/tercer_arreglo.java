package Grupal;

public class tercer_arreglo {

    public static void main(String[] args) {
        int indice1 = 0;
        int indice2 = 0;
        int indice3 = 0;
        char Arreglo1[] = {'a', 'b', 'c', 'd', 'e', 'f'};
        char Arreglo2[] = {'g', 'h', 'i', 'j', 'k'};
        for (indice1 = 0; indice1 < Arreglo1.length; indice1++) {
            System.out.print(Arreglo1[indice1] + " ");
        }
        System.out.println("");
        for (indice2 = 0; indice2 < Arreglo2.length; indice2++) {
            System.out.print(Arreglo2[indice2] + " ");
        }
        System.out.println("");

        int tam = Arreglo1.length + Arreglo2.length;
        String Arreglo3[] = new String[tam];
        for (indice3 = 0; indice3 < Arreglo3.length; indice3++) {
            for (indice1 = 0; indice1 < Arreglo1.length; indice1++) {
                if (indice3 <= tam / 2) {
                    Arreglo3[indice3] = Arreglo1[indice1];
                    System.out.print(Arreglo3[indice3]);
                }
            }
        }
    }
}

