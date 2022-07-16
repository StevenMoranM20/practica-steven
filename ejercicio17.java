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
public class ejercicio17 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //verificacion  de una palabra palidroma
        // entrada 
        String palabra = "";
        int longitud = 0;
        String palabraNueva = "";
        //Proceso
        palabra = JOptionPane.showInputDialog("Ingrese una palabra: ");
        longitud = palabra.length();
        for (int indice = longitud-1; indice>=0; indice--) {
            //Armo la palabra 
            palabraNueva = palabraNueva + palabra.charAt(indice);
        }
            //salida
            if (palabra.equals(palabraNueva)) {
            JOptionPane.showMessageDialog(null,"es palidrona");
        } else {
              JOptionPane.showMessageDialog(null,"no es palidrona");  
        }
        }
        
    }
    

