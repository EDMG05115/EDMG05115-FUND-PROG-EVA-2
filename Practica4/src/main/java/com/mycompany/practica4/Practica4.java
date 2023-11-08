/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.practica4;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class Practica4 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num;
        String salir;
        
        do {
            System.out.print("Ingresa un numero: ");
            num = input.nextInt();
            
            if (num < 0){
                System.out.println("Es negativo");
            } else if (num > 0){
                System.out.println("Es positivo");
            } else
                System.out.println("Es cero");
            
            System.out.println("¿Desea terminar el programa? (Ingrese si / no)");
            salir = input.next();
            
            if (salir.equals("si"))
                break;
            
        } while(true);
        
    }
}
