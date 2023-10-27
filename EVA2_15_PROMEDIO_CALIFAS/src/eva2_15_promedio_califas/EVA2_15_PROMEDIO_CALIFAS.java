
package eva2_15_promedio_califas;

import java.util.Scanner;

public class EVA2_15_PROMEDIO_CALIFAS {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int cantCali, califa;
        int sumaCalifa = 0;
        double prom;
        
        System.out.println("Ingrese la cantidad de calificaciones a ingresar");
        cantCali = input.nextInt();
        
        if (cantCali > 0) {
            
            for(int i = 1; i <= cantCali; i++ ){
                System.out.println("Calificación n° " + i + ": ");
                califa = input.nextInt();
                sumaCalifa = sumaCalifa + califa;
            }
            
            //sumaCalifa es una acumulador
            //Se puede escribir de la siguiente forma: sumaCalifa+=califa;
            
            prom = (sumaCalifa / (cantCali / 1.0));
            System.out.println("El promedio de calificaciones es = " + prom);
        
        } else
            System.out.println("No ingreso un número de calificación valida");
        
    }
    
}
