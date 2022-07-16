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
public class ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //verificacion de dos numeros 
        //entrada
        int numero1 = 4;
        int numero2 = 8;
        int residuo1 = 0;
        int residuo2 = 0;
        //proceso
residuo1=numero1%2;
residuo2=numero2%2;
        if (residuo1==0 && residuo2 ==0) {
              //salida
            System.out.println("los numeros son pares");
        }else {
            System.out.println("los numeros no son pares");
        }
       
    }

}
