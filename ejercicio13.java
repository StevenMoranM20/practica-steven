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
public class ejercicio13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // entrada 
        String numeroEnteroString = "5";
        String numeroDecimalString = "2.50";
        char caracterSexo = 'M';
        int numeroEnteroConvertido = 0;
        double numeroDecimalConvertido = 0.0;
        String caracterSexoString = "";

        // proceso
        int entrada = Integer.parseInt(JOptionPane.showInputDialog(null, "**** MENU DE CONVERCIONES*****" + "\n"
                + "1. CONVERTIR DE STRING - ENTERO " + "\n"
                + "2. CONVERTIR DE STRING - DOUBLE " + "\n"
                + "3. CONVERTIR DE CHAR - STRING " + "\n"
                + "4. SALIR"));
        // Aplicacion de anidaciones (IF)
        if (entrada == 1) {
            // presento la conversion de String- entero
            numeroEnteroConvertido = Integer.parseInt(numeroEnteroString);
            JOptionPane.showMessageDialog(null, "la convercion String - Entero es: " + numeroEnteroConvertido);

        } else if (entrada == 2) {
            numeroDecimalConvertido = Double.parseDouble(numeroDecimalString);
            JOptionPane.showMessageDialog(null, "La conversion String - Double es : " + numeroDecimalConvertido);

        } else if (entrada == 3) {
            caracterSexoString = String.valueOf(caracterSexo);
            JOptionPane.showMessageDialog(null, "La convercion char -String es: " + caracterSexoString);

        } else {
            JOptionPane.showMessageDialog(null, "Gracias por utilizar el sistema!");
            System.exit(0);
        }

        //salida
    }

}
