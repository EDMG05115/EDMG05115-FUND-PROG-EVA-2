/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva2_29_arreglos;

/**
 *
 * @author invitado
 */
public class EVA2_29_ARREGLOS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] arreglo = new int[20];
        //Vamos a llenar el arreglo de valores entre 0 y 99
        for (int i = 0; i < arreglo.length; i++) {
                         //Casting: convierte un double a un entero
            arreglo[i] = (int)(Math.random() * 100);
            
        }
        for (int i = 0; i < arreglo.length; i++) {
            System.out.print("[" +  arreglo[i] + "]");
        }
    }
}
