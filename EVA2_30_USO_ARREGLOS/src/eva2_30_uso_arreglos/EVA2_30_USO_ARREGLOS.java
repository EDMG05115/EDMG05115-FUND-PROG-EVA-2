
package eva2_30_uso_arreglos;

import java.util.Scanner;

public class EVA2_30_USO_ARREGLOS {

    public static void main(String[] args) {
        String[] listaProd = new String[10];
        listaProd[0] = "Tacos";
        listaProd[1] = "Tortas";
        listaProd[2] = "Tamales";
        listaProd[3] = "Tlacoyos";
        listaProd[4] = "Tlayudas";
        listaProd[5] = "Tampiqueñas";
        listaProd[6] = "Tortas ahogadas";
        listaProd[7] = "Tchilaquiles";
        listaProd[8] = "T-Bone";
        listaProd[9] = "Tripas";

        //Si tenemos los datos previamente, se aconseja hacerlo así:
        //String[] listaProd = {"Tacos", "Tortas"};
        double[] listaPrecios = {20, 40, 15, 50, 30, 54, 60, 200, 400, 10};

        System.out.println("-----MENÚ-----");
        for (int i = 0; i < listaProd.length; i++) {
                System.out.println(i + " - " + listaProd[i] + ": $" + listaPrecios[i]);	

        }

        Scanner input = new Scanner(System.in);
        int opc, cant;
        System.out.println("¿Qué deseas ordenar?");	
        opc = input.nextInt();

        System.out.println("¿Cuántas deseas ordenar?");	
        cant = input.nextInt();

        double total = (cant * listaPrecios[opc]);

        System.out.println("Tu total es de: $" + total);	
 
    }
    
}
