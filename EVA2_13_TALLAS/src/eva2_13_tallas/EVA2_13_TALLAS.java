/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva2_13_tallas;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class EVA2_13_TALLAS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int talla;
        
        System.out.println("Ingrese las dimensiones de la camisa");
        talla = input.nextInt();
        
        switch (talla) {
            case 29:
                System.out.println("Talla Small");
                break;
            case 42:
                System.out.println("Talla Medium");
                break;
            case 44:
                System.out.println("Talla Large");
                break;
            case 48:
                System.out.println("Talla Extra large");
                break;
            default:
                System.out.println("No existe la talla");
        }
    }  
}
