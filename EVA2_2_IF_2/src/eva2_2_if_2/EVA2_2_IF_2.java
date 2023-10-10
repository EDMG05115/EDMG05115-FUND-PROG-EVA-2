package eva2_2_if_2;

import java.util.Scanner;

public class EVA2_2_IF_2 {

public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      
      int valor1, valor2;
      
      System.out.println("Introduce el valor 1");
      valor1 = input.nextInt();
      
      System.out.println("Introduce el valor 2");
      valor2 = input.nextInt();
      
      if (valor1 > valor2) {
         System.out.println("Valor 1 es mayor. \n" + valor1 + " es mayor que " + valor2); 
         
      } else { 
         if (valor1 == valor2) {
            System.out.println("Ambos valores son iguales");
         
         } else {
            System.out.println("Valor 2 es mayor. \n" + valor2 + " es mayor que " + valor1);
         }
      } 
   }
}
