
package com.mycompany.practica6;

import java.util.Scanner;

public class Practica6 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num;
        String bina = "";
        
        System.out.print("Ingresa un numero: ");
        num = input.nextInt();
        
        do{
            if ((num % 2) == 0)
                bina = "0" + bina;
            else
                bina = "1" + bina;
            
            num/= 2;
            
            if(num < 1)
                break;
            
        } while(true);
        
        System.out.println("Equivale a: " + bina);
        
    }
}
