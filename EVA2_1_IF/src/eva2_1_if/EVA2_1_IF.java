package eva2_1_if;

import java.util.Scanner;

public class EVA2_1_IF {

   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      int califa;
      System.out.println("Introduce la calificación");
      califa = input.nextInt();
      
      /*
      if(califa >= 70) 
         System.out.println("Aprobado: Calificación mayor o igual a 70");         
      
         Se puede declarar sin necesidad de llaves
      
      if(califa >= 70) 
         System.out.println("Aprobado: Calificación mayor o igual a 70");
         System.out.println("Felicidades");
      
         En este caso unicamente "Aprobado" es parte del if y Felicidades es aparte
      */
          
      if(califa >= 70) {
         System.out.println("Aprobado: Calificación mayor o igual a 70");
         System.out.println("Felicidades!!");
      } else {
         System.out.println("No acredita: Calificación menor a 70");   
      }  
      
      System.out.println("Fin del programa");
   }
}
