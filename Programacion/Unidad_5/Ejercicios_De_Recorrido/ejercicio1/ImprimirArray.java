package Programacion.Unidad_5.Ejercicios_De_Recorrido.ejercicio1;

import java.util.Scanner;

public class ImprimirArray implements ImprimirArrayInterface {
    public static void main(String[] args) {
        int[] number = new int[10];
        Scanner scn = new Scanner(System.in);

        System.out.print("Introduce 10 numeros: ");
        extracted(number, scn);

        for (int i = 0; i < number.length; i++) {
            System.out.print(number[i] + " ");
        }

    }

    private static void extracted(int[] number, Scanner scn) {
        for (int i = 0; i < 10; i++) {
            number[i] = scn.nextInt();
        }
    }
}
