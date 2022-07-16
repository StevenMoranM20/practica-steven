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
public class ejercicio6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // validar el servicio del paquimetro
        //entrada
         String vehiculo = "auto";
         
        // proceso
        if (vehiculo.equals("auto") || vehiculo.equals("suv") || vehiculo.equals("camion")){
            System.out.println("tiene acceso al paquimetro");        
        } else {
            System.out.println("no tiene acesso al paquimetro");
        }
        // salida
    }
    
}
