
package eva2_28_uso_arreglos;

import java.util.Scanner;

public class EVA2_28_USO_ARREGLOS {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numCalifa;
        int[] califas;
        System.out.println("Ingresa cuantas calificaciones deseas capturar: ");
        numCalifa = input.nextInt();
        
        califas = new int[numCalifa];
        
        for (int i = 0; i < numCalifa; i++) {
            System.out.println("Calificacion " + (i + 1));
            califas[i] = input.nextInt();
        }

        System.out.print("Las calificaciones son: ");
        
        for (int j = 0; j < numCalifa; j++) {
            System.out.print(califas[j] + ", ");
        }
    }
}
