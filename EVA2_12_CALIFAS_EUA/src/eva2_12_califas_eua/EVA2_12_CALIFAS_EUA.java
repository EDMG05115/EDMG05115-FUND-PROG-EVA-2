
package eva2_12_califas_eua;

import java.util.Scanner;

public class EVA2_12_CALIFAS_EUA {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        int califa;
        String nota = " ";
        
        System.out.println("Ingresa la calificación del 1 - 100");
        califa = input.nextInt();
        
        if ((califa >= 0) && (califa <= 100) ) {
            
            if (califa < 60)
                nota = "F";
            else if ((califa >= 60) && (califa < 70))
                nota = "D";
            else if ((califa >= 70) && (califa < 80))
                nota = "C";
            else if ((califa >= 80) && (califa < 90))
                nota = "B";
            else if ((califa >= 90) && (califa <= 100))
                nota = "A";
            
            System.out.println("Tienes una " + nota);
            
        } else 
           System.out.println("Calificacion no valida");
   
    }
    
}
