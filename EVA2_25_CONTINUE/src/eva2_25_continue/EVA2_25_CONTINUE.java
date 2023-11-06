
package eva2_25_continue;

public class EVA2_25_CONTINUE {

    public static void main(String[] args) {
        
        //continue --> interumpe la iteración actual
        for (int i = 1; i <= 15; i++) {
            if(i == 7)
                continue;
            
            System.out.print(i + " - ");
        
        }
        System.out.println("");
        
        //break --> detiene por completo la ejecución del ciclo
        for (int i = 1; i <= 15; i++) {
            if(i == 7)
                break;
            
            System.out.print(i + " - ");
        
        }
        System.out.println("");

        //Obtener números pares del 1 al 20 mediante continue
        for (int i = 1; i <= 20; i++) {
            if((i % 2) != 0)
                continue;
            
            System.out.print(i + " - ");
        
        }
    }
}
