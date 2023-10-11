/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_4_bisiesto;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class EVA2_4_BISIESTO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int year;
        double residuo;
        System.out.println("Ingresar un año");
        year = input.nextInt();
        
        residuo = year % 2;
        if(residuo == 0){
            
            residuo = year % 100;
            
            if (residuo == 0){
                
                residuo = year % 400;
                
                if(residuo == 0){
                    System.out.println("Es un año bisiesto");
                
                } else {
                    System.out.println("No es un año bisiesto");
                }
          
            } else {
                System.out.println("Es un año bisiesto");
            }
            
        } else {
            System.out.println("No es bisiesto");
        }
        
    }
    
}
