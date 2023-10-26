
package eva2_14_ciclo_for;

import java.util.Scanner;

public class EVA2_14_CICLO_FOR {

   public static void main(String[] args) {
      //for --> desde
      //se ejecuta desde un punto hasta otro
      //for (punto de inicio; condición para el término; manera de avanzar (o retroceder))
       
      for (int i = 0; i < 10; i++) 
         System.out.print(i + " ");
      
      System.out.println("\n---------------------");
      for (int i = 9; i >= 0; i--) 
         System.out.print(i + " ");
      
      System.out.println("\n---------------------");
      for (int i = 0; i <= 100; i+= 2) 
         System.out.print(i + " ");
      
      System.out.println("\n---------------------");
      for (int i = 100; i >= 0; i-= 2) 
         System.out.print(i + " ");
         
   }
   
}
