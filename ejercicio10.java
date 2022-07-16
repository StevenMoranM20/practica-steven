/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;

/**
 *
 * @author STEVEN
 */
public class ejercicio10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // app que simule el calculo de roll de pago de un empleado 
        // entrada 
        String empleado ="steven moran";
        String cargo = "gerente de compras";
        double pagoHoras = 20.0;
        int numeroHora = 160;
        double sueldo = 0.0;
        double iess = 0.0;
        double netoRecibir = 0.0;
        
        // proceso 
         sueldo = numeroHora * pagoHoras;
         iess = sueldo * 0.09;
         netoRecibir = sueldo - iess;
         
        // salida
        System.out.println("-------ROL DEL MES DE MAYO 2022--------");
        System.out.println("Empleado: " +empleado);
        System.out.println("Cargo: "+cargo);
        System.out.println("Sueldo: "+ sueldo);
        System.out.println("Descuento IESS: "+ iess);
        System.out.println("Valor Neto Recibir: " + netoRecibir);
        
        
    
    }
    
}
