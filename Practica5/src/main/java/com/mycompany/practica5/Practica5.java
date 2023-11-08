/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.practica5;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class Practica5 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int base, exp, total;
        
        
        System.out.print("Ingrese la base del numero: ");
        base = input.nextInt();
        System.out.print("Ingrese el exponente del numero: ");
        exp = input.nextInt();
        
        total = base;
        
        for (int i = 1; i < exp; i++){
            total*= base;
        }
        
        if (exp == 0)
            total = 1;
        if (exp < 0)
            System.out.println("Exponente negativo");
        else    
            System.out.println(base + "^" + exp + " = " + total);
        
    }
}
