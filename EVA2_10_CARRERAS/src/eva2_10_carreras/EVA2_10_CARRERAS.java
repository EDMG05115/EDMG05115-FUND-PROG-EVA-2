/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva2_10_carreras;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class EVA2_10_CARRERAS {

   /**
    * @param args the command line arguments
    */
   public static void main(String[] args) {
      
      Scanner input = new Scanner(System.in);
      String carrera;
      System.out.println("Introduce la abreviatura de la carrera: ");
      carrera = input.next();
      
      switch(carrera) {
      case "ISC":
         System.out.println("Ingeniería en Sistemas Computacionales");
         break;
      case "INF":
         System.out.println("Ingeniería Informática");
         break;
      case "LA":
         System.out.println("Licenciatura en Administración");
         break;
      case "ARQ":
         System.out.println("Arquitectura");
         break;
      case "IND":
         System.out.println("Ingeniería Industrial");
         break;
      case "IDI":
         System.out.println("Ingeniería en Diseño Industrial");
         break;
      case "IGE":
         System.out.println("Ingeniería en Gestión Empresarial");
         break;
      default:
         System.out.println("La abreviatura " + carrera + " es no es valido");   
      }   

   }
   
}
