package Programacion.Unidad_1.Ejercicios_1_2.bucles;

import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        int numEntero = 0, inicio;
        double numReal = 0;
        Scanner lector = new Scanner(System.in);

        System.out.print("Introduce un numero: ");
        numReal = lector.nextDouble();

        System.out.print("Introduce el exponente: ");
        numEntero = lector.nextInt();

        for (inicio = 1; inicio < numEntero; inicio++) {
            if (numEntero < 0) {
                numReal = 1 / (numReal + numReal);
            }
            if (numEntero == 0) {
                numReal = 1;
            } else {
                numReal += numReal;
            }
        }

        System.out.println("La exponencia es: " + numReal);

    }
}
