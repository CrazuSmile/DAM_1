package Programacion.Unidad_1.Ejercicios_1_2.bucles;

import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        int A, B, A2;
        Scanner lector = new Scanner(System.in);

        System.out.print("Introduce un valor: ");
        A = lector.nextInt();

        System.out.print("Introduce un valor mayor al del anterior: ");
        B = lector.nextInt();
        A2 = A;
        System.out.println("----------------------------------------");
        if (A < B) {

            System.out.println("Los valores comprendidos entre los 2 valores introduciods: ");


            while (A <= B) {

                System.out.print(A + ", ");
                A++;

            }
            System.err.println();
            System.out.println("----------------------------------------");
            System.out.println("Estos son los valores pares: ");

            while (A2 <= B) {

                if (A2 % 2 == 0) {
                    System.out.print(A2 + ", ");
                    A2++;
                } else {
                    A2++;
                }

            }
        } else {
            System.out.print("Error, el valor introducido no es valido");
        }
    }
}
