/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_32_arreglos_multidim;

/**
 *
 * @author invitado
 */
public class EVA2_32_ARREGLOS_MULTIDIM {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
	int[][] matriz = new int[3][4]; //Dos dimensiones, dos corchetes
	//Poner datos manuales
	matriz[1][3] = 100;
	System.out.println("matriz[1][3] = " + matriz[1][3]);
        //----------
        //Llenar con valores aleatorios la matriz:
        //Filas
        //System.out.println("Filas: " + matriz.length);
        
        for (int i = 0; i < matriz.length; i++) {
            
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = (int)(Math.random() * 100);
                
            }
            
        }
        
        for (int i = 0; i < matriz.length; i++) {
            System.out.println("Columnas: " + matriz[i].length);
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print( "[" + matriz[i][j]+ "]");
                
            }
            
            System.out.println("");
        }
              
    }
    
}
