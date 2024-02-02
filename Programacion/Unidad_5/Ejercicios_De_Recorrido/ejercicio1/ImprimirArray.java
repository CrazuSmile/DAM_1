package Programacion.Unidad_5.Ejercicios_De_Recorrido.ejercicio1;

import java.util.Scanner;

public class ImprimirArray {
    public static void main(String[] args) {
        int[] number = new int[10];
        Scanner scn = new Scanner(System.in);

        System.out.print("Introduce 10 numeros: ");
        for (int i = 0; i < 10; i++) {
            number[i] = scn.nextInt();
        }

        for (int i = 0; i < number.length; i++) {
            System.out.print(number[i] + " ");
        }

    }
}
