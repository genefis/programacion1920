/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package POO;

/**
 *
 * @author UTPL
 */
public class Tiempo {
    // Atributos de la clase, se declara de forma global
    private int hora;
    private int minuto;
    private int segundo;
    /**
     * 
     */
    public Tiempo (){
        System.out.println("Se iniciado la clase tiempo");
    }
    /**
     * Este metodo es el contructor de la clase
     * El contructor se ejecuta al momento de crear un objeto para la clase tiempo
     */
    public Tiempo(int hora,int minuto,int segundo){
        
         this.hora=hora;
        this.minuto=minuto;
        this.segundo=segundo;
        
    }
    
    /**
     * Metodo que devuelve o encpsula al atributo hora 
     * y sirve para devolver el valor que tiene la variable hora
     * @return 
     */
    public int obtener_hora(){
        return hora;
    }
    public int obtener_minuto(){
        return minuto;
    }
    public int obtener_segundo(){
        return segundo;
    }
    
    public String Tiempo_real(){
        String tiempo= hora+":"+minuto+":"+segundo;
        return tiempo;
    }
    
}
