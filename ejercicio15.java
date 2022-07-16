/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;

import javax.swing.JOptionPane;

/**
 *
 * @author STEVEN
 */
public class ejercicio15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // app utilisando switch - case combinando con ciclo repetitivos
        // evaluar 2 excenarios donde 1 presente el numero desendente hasta llegar del numero ingresado 
        // 2 presentar los numero ingresado de forma ascendente hasta llegar a 20

        int numeroIngresado = 0;
        int contadorDesendente = 0;
        int contadorAscendente = 0;
        // proceso
        numeroIngresado = Integer.parseInt(JOptionPane.showInputDialog(null, "ingrese un numero:"));
        int entrada = Integer.parseInt(JOptionPane.showInputDialog(null, "**** MENU DE CONVERCIONES*****" + "\n"
                + "1. Presenta Secuencia Descendente " + "\n"
                + "2. Presenta Secuencia Ascendente " + "\n"
                + "3. Salir"));
        switch (entrada) {
            case 1:
                //generamos la secuencia ascendente
                while (numeroIngresado < 10) {
                    JOptionPane.showMessageDialog(null, numeroIngresado);
                    numeroIngresado++;
                }
                break;
            case 2:
                //generamos la secuencia descendente
                while (numeroIngresado > 1) {
                    numeroIngresado--;
                    JOptionPane.showMessageDialog(null, numeroIngresado);
                }
                break;
        }
    }
}
