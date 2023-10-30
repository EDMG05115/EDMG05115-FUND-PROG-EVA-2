
package eva2_19_while_infinito;

import java.util.Scanner;

public class EVA2_19_WHILE_INFINITO {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = 10;
        int captu = 0;
        
        System.out.println("Adivina el numero!!!" );       
 
        System.out.println("Introduce un número: ");
        while(true){// Ciclo infinito, por si solo, nunca se va a detener
            
            captu = input.nextInt();
            if(captu == num){
                System.out.println("Felicidades el numero era " + num);
                break;//Romper --> Detiene la ejecución del ciclo
            }
        }
    }
}
