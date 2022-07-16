/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package app;

import javax.swing.JOptionPane;

/**
 *
 * @author STEVEN
 */
public class ejercicio19 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // numero primo 
        int numero = 2;
        int antecesores;
        int contadorDivisibles = 0;
        //proceso
        antecesores = numero - 1;
        while (antecesores > 1) {
            if (numero % antecesores == 0) {
                contadorDivisibles++;
            }
            antecesores--;
        }
        //validar si es primo
        if (contadorDivisibles == 0) {
            JOptionPane.showMessageDialog(null, "es numero primo:");
        } else {
                JOptionPane.showMessageDialog(null, "No es numero primo:");
        }

    }

}
