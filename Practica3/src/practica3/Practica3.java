/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica3;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class Practica3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num1;
        int sum = 0;

        System.out.println("Ingresa numero entero: ");
        num1 = input.nextInt();
        
        for (int i = 1; i <= num1; i++) {
            sum+= i;
            
        }
        
        System.out.println("La sumatoria de los numeros es del 1 al " + num1 + " es: " + sum);
    }
    
}
