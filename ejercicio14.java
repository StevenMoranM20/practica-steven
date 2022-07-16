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
public class ejercicio14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // app que permita presentar la cantidad de vocales y consonante 
        // de una palabras 
        String palabra = "";
        int longitud = 0;
        int cantidadVocales=0;
        int cantidadConsonante=0;
        
        palabra= JOptionPane.showInputDialog(null, "ingrese la palabra");
        // proceso : obtenemos la longitud de la palabra 
        longitud = palabra.length();
        // proceso: recorrer y contar las vocales y consonantes (ciclo FOR)
        for (int indice=0; indice<longitud; indice++) {
            // validadcion de vocales 
            if (palabra.charAt(indice)=='a'|| palabra.charAt(indice) =='e'
                    || palabra.charAt(indice) =='i' || palabra.charAt(indice)=='o'
                    || palabra.charAt(indice) =='u' ) {
                cantidadVocales++;
                
                
            }else{
            cantidadVocales++;
            }
        }
        
        
    }
    
}
