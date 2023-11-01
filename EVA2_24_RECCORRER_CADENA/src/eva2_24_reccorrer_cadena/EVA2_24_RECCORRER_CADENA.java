/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva2_24_reccorrer_cadena;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class EVA2_24_RECCORRER_CADENA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);   
        String cade;
        
        System.out.println("Introduce un texto: ");
        cade = input.nextLine();
        
        for (int i = 0; i < cade.length(); i++){
            System.out.println(cade.charAt(i));
        }
    }
    
}
