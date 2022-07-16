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
public class ejercicio12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // converciones a java 
        // entrada 
        String numeroEnteroString = "5";
        String numeroDecimalString = "2.50";
        int numeroEnteroConvertido = 0;
        double numeroDecimalConvertido =0.0;
       
        // proceso
       numeroEnteroConvertido =Integer.parseInt(numeroEnteroString);
       numeroDecimalConvertido = Double.parseDouble(numeroDecimalString);
       // salida 
        JOptionPane.showMessageDialog(null,"El numero convertido es; " +numeroEnteroString);
        JOptionPane.showMessageDialog(null, "El numero decimal es;" +numeroDecimalConvertido);
        
        
    }
    
}
