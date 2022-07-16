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
public class ejercicio9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // app que permita validar el lugar de votacion la edad y mesa y un proceso de elecciones presidenciales 
        String nombre = "steven";
        boolean edad = true;
        boolean mesa = true;
        boolean lugar = true;
        
        if (edad == true ) {
            if (mesa == true ) {
                if (lugar == true ) {
                    System.out.println("esta acto para realizar el proceso de votacion: "+ nombre);
                }else{
                    System.out.println(" no puede votar pero tiene la edad  " + nombre);
                }
                
            }else{
                System.out.println(" tiene la edad conoce el lugar pero no conoce la mesa  "+ nombre);
            }
            
        }else{ System.out.println("no puede votar por su edad  " + nombre);
        }
    }
    
}
