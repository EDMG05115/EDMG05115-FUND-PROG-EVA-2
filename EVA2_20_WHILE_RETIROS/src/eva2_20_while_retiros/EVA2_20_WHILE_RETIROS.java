/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva2_20_while_retiros;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class EVA2_20_WHILE_RETIROS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int canti = 1000;
        int retiro;
        
        while(canti>0){
            System.out.println("¿Cuánto dinero desea retirar?");
            retiro = input.nextInt();
            canti-= retiro; //Acumulador
           
            if (canti < 0){
                System.out.println("Cantidad invalida");
                canti+=retiro;
            }
            System.out.println("Su nuevo saldo es de: $" + canti);
        }
    }
}
