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
public class EjecutaTiempo {
    public static void main(String[] args) {
        // vamos a llamr o instansear a la clase Tiempo, para ello creamos un objeto
        Tiempo objeto_tiempo = new Tiempo (20,17,30);
       
        System.out.println("valor de hora: "+objeto_tiempo.obtener_hora());
        System.out.println("valor de hora: "+objeto_tiempo.obtener_minuto());
        System.out.println("valor de hora: "+objeto_tiempo.obtener_segundo());
        System.out.println("tiempo:"+objeto_tiempo.Tiempo_real());
        
        //vamos a crear un segundo objeto de la clase tiempo
        Tiempo tiempo2 = new Tiempo();
        System.out.println("valor de hora"+tiempo2.obtener_hora());
    }
}
