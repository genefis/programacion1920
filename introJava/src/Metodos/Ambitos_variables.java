package Metodos;
public class Ambitos_variables {
    //creacion de variables globales 
    int sueldo_basico = 400;
    double aporte_iees = 0.09;
    /**
     * Calcula el aporte al iees de un trabajador 
     *
     * @return
     */
    public double calcular_aporte_iees() {
        double aporte = sueldo_basico * aporte_iees;
        return aporte;
    }
    /**
     * metodo para calcular el valor liquido a depositar del suelo.
     * @return 
     */
    public double Valor_A_depositar(){
      
        double valor_liquido= sueldo_basico-calcular_aporte_iees();
        return valor_liquido;
    }
    public static void main(String[] args) {
        Ambitos_variables objeto = new Ambitos_variables();
        double calculo = objeto.calcular_aporte_iees();
        System.out.println("Sueldo basico:" + objeto.sueldo_basico);
        System.out.println("El aporte al Iees es:" + calculo);
        double valor_deposito=objeto.Valor_A_depositar();
        System.out.println("Valor a depositar al trabajador "+valor_deposito);
    }
}
