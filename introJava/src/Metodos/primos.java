package Metodos;

public class primos {

    public static void main(String[] args) {
        
    }

    /**
     * metodo para verificar si un numeroo dado e sprimo o no
     *
     * @param numero
     * @return
     */
    public static boolean Detectar_primos(int numero) {
        boolean resultado = false;
        int acumulador=0;
        for (int i = 1; i <= numero; i++) {
            if (numero % i == 0) {
                acumulador = acumulador + 1;

            }
            if (acumulador==2){
                resultado=true;
            }

        }

        return resultado;
    }
    /**
     * metodo que permite contabilizar cuantos numeros primos existe hasta 
     * el limite indicado
     * @param limite :Valor maximo para evaluar
     */
    public static void Contabilizar_primos(int limite) {
        int cont_primos=0;
        for (int indice = 0; indice < limite; indice++) {
            if (Detectar_primos(indice)==true);
            cont_primos++;
            
        }
        System.out.println("Se han encontrado"+cont_primos+"hasta el"+limite);
    }
}
