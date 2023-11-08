/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.practica9;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class Practica9 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String cade, letra;
        int cont = 0;
        
        System.out.println("Ingresa un cadena de texto: ");
        cade = input.nextLine();    
        
        System.out.println("Ingresa el caracter que deseas contar: ");
        letra = input.nextLine();    
        
        char caracter = letra.charAt(0);
        
        for (int i = 0; i < cade.length(); i++){
            
            if (caracter == cade.charAt(i)) {
                cont = cont + 1;
            
            }
           
        }
        System.out.println("El caracter " + caracter + " en la cadena '" + cade + "' aparecio " + cont + " veces");
    }
}
