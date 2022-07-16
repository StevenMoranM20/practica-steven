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
public class ejercicio11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // pedir datos entrada  por consolas
        //ENTRADA
        Scanner entrada = new Scanner(System.in);
        String producto ="";
        int cantidad =0;
        double precio = 0.0;
        double total = 0.0;
        System.out.println("----------- VENTA DE PRODUCTOS---------");
        // PROCESO
        System.out.print("ingrese el producto: ");
        producto = entrada.nextLine();
        System.out.print("ingrese el precio:");
        precio = entrada.nextDouble();
        System.out.print("ingrese cantidad: ");
        cantidad = entrada.nextInt();
        // calculo
        total = cantidad * precio;
        // salida
        System.out.println("EL TOTAL A CANCELAR ES:" + total);
        
        
    }
    
}
