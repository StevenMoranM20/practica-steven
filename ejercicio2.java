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
public class ejercicio2 {

    public static void main(String[] args) {
// VALIDACION NUMERO PAR / IMPAR
// entrada 
        int numero1 = 2;
        int residuo = 0;
// Proceso 
        residuo = numero1 % 2;
// condicion 
        if (residuo == 0) {
            System.out.println("El numero par");
        } else {
            System.out.println("El numero es impar");
        }

    }

}
