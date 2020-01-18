package POO;

public class Cajero {
    private int saldo;
    
    
    public Cajero(int saldo) {
        this.saldo=saldo;
    }
    /**
     * Metodo para consultar saldo
     *
     * @return
     */
    public int consultar_saldo() {
        return saldo;
    }
    /**
     * metodo para realizar un deposito
     *
     * @param valor_deposito
     */
    public void depositar(int valor_deposito) {
        if (valor_deposito > 0) {
            saldo = saldo + valor_deposito;
        } else {
            System.out.println("el valor ingresado no es correcto");
        }
    }
    /**
     * Metodo para calcular un retiro
     *
     * @param valor_retiro
     */
    public void retirar(int valor_retiro) {
        if (valor_retiro <= saldo) {
            saldo = saldo - valor_retiro;
        } else {
            System.out.println("El valor ingresado no es correcto");
        }
    }
}
