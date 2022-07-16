/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;

import java.util.Scanner;

/**
 *
 * @author STEVEN
 */
public class tareaDoWhile1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        int numero1, numero2, resultado;
        int x;
        boolean dato = true;
        do {            
            System.out.println("ingrese el numero 1: ");
            numero1 = entrada.nextInt();
             System.out.println("ingrese el numero 2: ");
            numero2 = entrada.nextInt();
            
            resultado = numero1 + numero2;
            
            System.out.println("la suma es: "+ resultado + "\n");
            
            System.out.println("desea repetir la condicion?\n1. Si\n2. No \nOpcion:");
            x = entrada.nextInt();
            if (x!=1) {
                dato = false;
            }
        } while (dato);
    }
    
}
