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
public class ejercicio20 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         int numero;
        int antecesores= 0;
        int acomuladorDivisibles = 0;
        //proceso
        numero = Integer.parseInt( JOptionPane.showInputDialog(" ingrese su numero"));
       
        antecesores = numero -1;
        while (antecesores > 0) {            
            if (numero% antecesores==0) {
                acomuladorDivisibles = acomuladorDivisibles + antecesores;
            }
            antecesores--;
        }
        //salida
        if (numero==acomuladorDivisibles) {
            JOptionPane.showMessageDialog(null," es perfecto");
        } else {
            JOptionPane.showMessageDialog(null,"no es perfecto");
        }
    }
    
}
