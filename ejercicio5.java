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
public class ejercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // entrada
        String nombre = "steven";
        int edad = 20;
//proceso
        if (edad >= 18 && edad <= 30) {
            System.out.println(nombre  + "tiene acceso a la fiesta");
        } else {
            System.out.println(nombre  + "no tiene acceso ");
        }
    }
}
