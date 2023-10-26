package Programacion.Unidad_1.Ejercicios_1_2.bucles;

import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args) {
        int numero, contador = 2;
        boolean primo = true;

        Scanner lector = new Scanner(System.in);

        System.out.print("Introduce un numero a factorizar: ");
        numero = lector.nextInt();

        while ((primo) && (contador != numero)) {
            if (numero % contador == 0)
                primo = false;
            contador++;
        }
        if (primo) {
            System.out.println(numero);

        } else {
            while (numero > 1) {
                if (numero % 2 == 0) {
                    System.out.print("*2*");
                    numero /= 2;
                }
                if (numero % 3 == 0) {
                    System.out.print("*3*");
                    numero /= 3;
                }
                if (numero % 5 == 0) {
                    System.out.print("*5*");
                    numero /= 5;
                }
                if (numero % 7 == 0) {
                    System.out.print("*7*");
                    numero /= 7;
                }

            }

        }
    }
}
