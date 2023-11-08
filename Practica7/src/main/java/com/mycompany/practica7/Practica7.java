/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.practica7;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class Practica7 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num;
        int mayor = 0;
        int menor = 0;
        
        do{
            System.out.println("Ingresa un numero: ");
                num = input.nextInt();
           
            if ((num >= mayor) && (num >= 0))
                mayor = num;
            
            else if ((num <= menor) && (num >= 0))
                menor = num;
        
        } while(num >= 0);
        
        System.out.println("Numero mayor: " + mayor);
        System.out.println("Numero menor: " + menor);
    }
}
