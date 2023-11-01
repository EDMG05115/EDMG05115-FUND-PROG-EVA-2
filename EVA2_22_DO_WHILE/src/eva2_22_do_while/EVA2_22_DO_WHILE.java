
package eva2_22_do_while;

import java.util.Scanner;

public class EVA2_22_DO_WHILE {
    
    final static String NOMBRE_USUARIO = "Admin";
    final static String PASSWORD = "Admin";
            
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);    
        String usuario;
        String password;
        
        do {
            System.out.println("Introduce el usuario: ");
            usuario = input.next();
            System.out.println("Introduce la contraseña: ");
            password = input.next();
        } while (!((usuario.equals(NOMBRE_USUARIO))&&(password.equals(PASSWORD))));
        
        /*Tambien se puede poner
        } while ((!usuario.equals(NOMBRE_USUARIO))||(!password.equals(PASSWORD)));
        
        */
    }
    
}
