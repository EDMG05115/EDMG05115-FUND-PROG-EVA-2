/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica2;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class Practica2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int num1, num2, mayor, menor;

        System.out.println("Ingresa el primer numero entero: ");
        num1 = input.nextInt();

        System.out.println("Ingresa el segundo numero entero: ");
        num2 = input.nextInt();

        if (num1 > num2) {
            mayor = num1;
            menor = num2;
        } else {
            mayor = num2;
            menor = num1;
        }

        System.out.print("Los numeros pares entre ellos son: ");

        for (int i = menor; i < mayor; i++) {
            if (i == menor) 
                continue;
            
            if ((i%2) != 0 )
                continue;
            
            System.out.print(i + " ");
        }
    }
    
}
