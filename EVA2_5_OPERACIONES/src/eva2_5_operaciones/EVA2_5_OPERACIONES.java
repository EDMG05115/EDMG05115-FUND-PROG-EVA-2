
package eva2_5_operaciones;

public class EVA2_5_OPERACIONES {

    public static void main(String[] args) {
        //OPERADOR --> SÍMBOLO QUE EJECUTA ALGUNA ACCIÓN
        //SUMA --> + 
        int suma, val1, val2;
        val1 = 100;
        val2 = 200;
        
        //-------------------------Suma (+)
        suma = val1 + val2; //Suma aritmética
        System.out.println("La suma es = " + suma); //Concatenación
        
        //-------------------------Resta (-)
        int resta;
        resta = val1 - val2;
        System.out.println("La resta es = " + resta);
        
        //-------------------------Multiplicación (*)
        int multi;
        multi = val1 * val2;
        System.out.println("La multiplicación es = " + multi);
        
        //-------------------------División (/)
        int div;
        div = val2 / val1; 
        System.out.println("La división es = " + div);
        val1 = 11;
        val2 = 2;
        div = val1 / val2;
        System.out.println("La segunda división (11/2) es = " + div);
        //-------------------------División con decimal
        
        /* PARA CUANDO QUIERAS VALORES ENTEROS
        double resu = val1 / val2;
        System.out.println("El resultado es = " + resu);
        */
        
        double val2Double = 2;
        double resu = val1 / val2Double;
        System.out.println("La división 11/2 = " + resu);
        
        resu = 11 / 2.0;
        System.out.println("La división 11/2 = " + resu);
        
        // int resu2 = 11 / 2.0; //Pérdida de información
        
        //-------------------------Potencia
        
        double potencia = (Math.pow(3, 3));
        System.out.println("La potencia 3^3 es = " + potencia);
        
        //-------------------------Raiz
        double raiz = (Math.pow(100, 0.5));
        System.out.println("La raiz cuadrada de 100 = " + raiz);
        
        //-------------------------Precedencia de operaciones
        int resuOp, x = 3, y = 2, z = 5;
        resuOp = (x * z) + (x * y) / 2 - (y - z);
               // (15)     (6)/ 2      -  (-3)
               // 15 + 3 -(-3)
               //15 + 3 + 3 = 21
        System.out.println("El resultado es = " + resuOp);
        //-------------------------FORMULA GENERAL
        
        double resuForm, a = 3, b = 9, c = 3;
        resuForm = (  (-b) + Math.sqrt(Math.pow(b, 2) - (4 * a * c))) / (2 * a);
        System.out.println("X1 = " + resuForm);
        
        resuForm = (  (-b) - Math.sqrt(Math.pow(b, 2) - (4 * a * c))) / (2 * a);
        System.out.println("X2 = " + resuForm);
        
    }
    
}



