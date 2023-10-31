package Programacion.Unidad_1.Ejercicios_1_2.bucles;

import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args) {
        int numero, divisor = 2;
        Scanner lector = new Scanner(System.in);

        System.out.print("Introduce un numero a factorizar: ");
        numero = lector.nextInt();

        while (numero <= 0) {
            System.out.print("Introduce un valor correcto: ");
            numero = lector.nextInt();
        }
        System.out.print(numero + " = ");
        while (numero > 1) {
            if (numero % divisor == 0) {
                System.out.print(divisor);
                numero /= divisor;
                if (numero > 1) {
                    System.out.print(" * ");
                }
            } else {
                divisor++;
            }
        }

    }
}
