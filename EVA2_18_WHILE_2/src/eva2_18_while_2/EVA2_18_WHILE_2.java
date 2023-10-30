
package eva2_18_while_2;

import java.util.Scanner;

public class EVA2_18_WHILE_2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double num = 10;
        int captu = 0;
        
        System.out.println("Adivina el numero!!!" );       
 
        while(captu != num)
             captu = input.nextInt();
 
        System.out.println("Felicidades el numero era " + num);
         
    }
}
