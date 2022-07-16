/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;

/**
 *
 * @author STEVEN
 */
public class ejercicio8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // app que valide el medio de pago en efectivo 
        //entrada 
        String vehiculo ="ford";
        boolean licencia = false;
        boolean efectivo = true;
        
        // proceso 
        if (licencia == true) {
            if (efectivo == true) {
                System.out.println("se ejecuta la venta del vehuculo: "+vehiculo);
            }else{
            System.out.println("no se ejecuta la venta del vehiculo: " +vehiculo);
        } 
        }
        
        // salida
        
    }
    
}
