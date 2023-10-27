/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva2_16_factorial;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class EVA2_16_FACTORIAL {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numero;
        int fact = 1;
    
        
        System.out.println("Ingrese un número: ");
        numero = input.nextInt();
        int a = numero;
        if (numero > 0) {
            
            for(int i = 1; i <= numero; i++){
                fact = fact * i;
                System.out.print(i + " x ");
            }
            System.out.println("\nFactorial de " + numero + " = " + fact);
            fact = 1;
            
            for(int i = numero; i >= 1; i-- ){
                fact = (fact * i);
                System.out.print(i + " x ");
            }
            
            System.out.println("\nFactorial de " + numero + " = " + fact);
        } else
            System.out.println("Numero no valido");
        
    }
    
}
