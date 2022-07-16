/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//Ejercciio16: Ciclos do while
package app;

import javax.swing.JDesktopPane;
import javax.swing.JOptionPane;

public class ejercicio16 {

    public static void main(String[] args) {
        // length() sirve para leer letra x letra 
        // entrada
        String palabra = "";
        int indice = 0;
        int longitud = 0;
        
        //proceso
       palabra = JOptionPane.showInputDialog("ingrese una palabra");
       longitud = palabra.length();
        do {            
            JOptionPane.showMessageDialog(null, palabra.charAt(indice));
            indice++;
        } while (indice < longitud);
        //salida
        
      
    }
    
}
