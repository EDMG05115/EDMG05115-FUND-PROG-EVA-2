/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva2_23_do_while_validar;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class EVA2_23_DO_WHILE_VALIDAR {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String cade;
        boolean valor = true;
        
        do {
            System.out.println("Ingrese un numero entero: ");
            cade = input.next();
                        
            for(int i = 0; i < cade.length(); i++){                
               
                if (Character.isDigit(cade.charAt(i))){
                    valor = false;
                } else {
                    valor = true;
                    break;
                }
            }
            
        } while (valor);
        System.out.println("Valor valido: " + cade);    
    }
}
