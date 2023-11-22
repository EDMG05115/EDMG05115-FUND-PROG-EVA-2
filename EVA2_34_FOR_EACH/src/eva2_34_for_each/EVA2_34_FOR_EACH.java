
package eva2_34_for_each;

public class EVA2_34_FOR_EACH {

    public static void main(String[] args) {
        
        //FOR EACH --> FOR PARA RECORREC ARREGLOS
        //SOLO SIRVE PARA LEER ARREGLOS
        int arreglo[] = new int[10];

        for (int i = 0; i < arreglo.length; i++) {
            arreglo[i] = (int)(Math.random() * 100);
        }
    
        for (int valor : arreglo) {
            System.out.print("[" + valor + "]");
        }
        System.out.println("");
        String mensaje[] = {"Hola"," ","mundo"," ","cruel!!!"};
        for (String valor : mensaje) {
            System.out.print(valor);
        }
    }
    
}
