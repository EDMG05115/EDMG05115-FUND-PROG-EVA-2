package practica.pkg1;

import java.util.Scanner;

public class Practica1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num1, num2, mayor, menor;

        System.out.println("Ingresa el primer numero entero: ");
        num1 = input.nextInt();

        System.out.println("Ingresa el segundo numero entero: ");
        num2 = input.nextInt();

        if (num1 > num2) {
            mayor = num1;
            menor = num2;
        } else {
            mayor = num2;
            menor = num1;
        }

        System.out.print("Los numeros entre ellos son: ");

        for (int i = menor; i < mayor; i++) {
            if (i == menor) {
                continue;
            }
            System.out.print(i + " ");
        }

    }

}
