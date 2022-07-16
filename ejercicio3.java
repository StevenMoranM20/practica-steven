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
public class ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // multiplos de 7
        int numero1 = 40;
        int multiplo = 0;
        //proceso
        multiplo = numero1 % 7;

        //condicion 
        if (multiplo == 0) {
            System.out.println("Es multiplo de 7");
        } else {
            System.out.println("No es multiplo de 7");
        }
    }

}
