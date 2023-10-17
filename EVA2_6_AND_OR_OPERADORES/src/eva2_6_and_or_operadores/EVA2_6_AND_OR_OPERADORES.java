
package eva2_6_and_or_operadores;

import java.util.Scanner;

public class EVA2_6_AND_OR_OPERADORES {

   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      int califa;
      System.out.println("Ingresa tu calificación");
      califa = input.nextInt();
      
      //Se evalua si la calificación es correcta (0 - 100)
      if ((califa >= 0 ) && (califa <= 100)){
         System.out.println("Tu calificación " + califa + " es válida");         
         
         if (califa >= 70)
            System.out.println("Acreditas!!!");
         else 
            System.out.println("No acreditas");
         
      //Si es invalida se muestra este mensaje
      } else 
         System.out.println("Tu calificación " + califa + " es inválida");
      
     
   }
   
}
