/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva2_21_do_while;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class EVA2_21_DO_WHILE {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);    
        int valor;
        //ASEGURA AL MENOS UNA VEZ LA EJECUCIÓN DE LAS INTRUCCIONES DENTRO DEL CICLO 
        
        do{
            System.out.println("Introduce un valor: ");
            valor = input.nextInt();
            
        } while(valor != 100);
    }
    
}
