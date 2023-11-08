/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.practica8;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class Practica8 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String letra;
        
        do{
            System.out.println("Ingresa un caracter alfabetico - Ingresa espacio para salir del programa. ");
            letra = input.nextLine();
            
            switch (letra) { 
        
            case "a":
                System.out.println("Es vocal.");
                break;
            case "e":
                System.out.println("Es vocal.");
                break;
            case "i":
                System.out.println("Es vocal.");
                break;
            case "o":
                System.out.println("Es vocal.");
                break;
            case "u":
                System.out.println("Es vocal.");
                break;
            default:
                if((letra.length() == 1))
                    System.out.println("Es consonante");
                
            }
            
        } while(letra.length() != 0);
    }
}
