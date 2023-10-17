/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_7_anio_bisiesto;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class EVA2_7_ANIO_BISIESTO {

   /**
    * @param args the command line arguments
    */
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      int fecha, resi4, resi100, resi400;
      System.out.println("Ingrese un año: ");
      fecha = input.nextInt();
    
      resi4 = fecha % 4;
      resi100 = fecha % 100;
      resi400 = fecha % 400;
      
      System.out.println(resi4 + "  " + resi100 + " " + resi400);
      if ((resi4 == 0) && ((resi100 != 0) || (resi400 == 0))){
       
         System.out.println("Es bisiesto");
      
      } else 
         System.out.println("No es bisiesto");
      
     
   }
   
}
