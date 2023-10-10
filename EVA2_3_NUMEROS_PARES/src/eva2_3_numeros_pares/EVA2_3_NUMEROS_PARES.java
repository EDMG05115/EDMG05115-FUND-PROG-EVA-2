package eva2_3_numeros_pares;

import java.util.Scanner;

public class EVA2_3_NUMEROS_PARES {

   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      
      int valor;
      double residuo;
      
      System.out.print("Introduce un numero: ");
      valor = input.nextInt();
      

      residuo = valor % 2; //Módulo, calcula el residuo.

      if (residuo == 0) {
         System.out.println("El número " + valor + " es par."); 
         
      } else { 
         System.out.println("El número " + valor + " es impar.");
      }
   }
}
