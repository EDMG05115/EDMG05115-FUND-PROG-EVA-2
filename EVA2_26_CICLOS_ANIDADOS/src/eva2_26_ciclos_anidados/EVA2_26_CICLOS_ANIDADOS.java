
package eva2_26_ciclos_anidados;

import java.util.Scanner;

public class EVA2_26_CICLOS_ANIDADOS {

    public static void main(String[] args) {
        int numero;
        Scanner input = new Scanner(System.in);
        
        System.out.println("Ingrese un número: ");
        numero = input.nextInt();
        
        for(int i = 1; i <= numero; i++){
            
            for(int j = 1; j <= i; j++)
                System.out.print("* ");
            
            System.out.println("");
        }
        
        //fila extra para que el triangulo sea impar
        for(int i = 1; i <= (numero + 1); i++){
            System.out.print("* ");
        }
        System.out.println("");

        
        for(int i = numero; i >= 1; i--){
            
            for(int j = 1; j <= i; j++)
                System.out.print("* ");
            
            System.out.println("");
        }
    }
}
