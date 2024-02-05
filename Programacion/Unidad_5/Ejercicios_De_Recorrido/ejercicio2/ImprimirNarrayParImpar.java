package Programacion.Unidad_5.Ejercicios_De_Recorrido.ejercicio2;

import java.util.Scanner;

public class ImprimirNarrayParImpar {
    public static void main(String[] args) {
        int n;
        Scanner scn = new Scanner(System.in);

        System.out.print("Cuantas variables planeas añadir: ");
        n = scn.nextInt();

        int[] alfanum = new int[n];

        for (int i = 0; i < n; i++) {
            alfanum[i] = scn.nextInt();
        }


        System.out.print("Los numeros pares del Array: ");
        for (int i = 0; i < alfanum.length; i++) {
            if (alfanum[i]%2 == 0) {
                System.out.print(alfanum[i] + " ");
            }
        }

        System.out.println();

        System.out.print("Los numeros impares del Array: ");
        for (int i = 0; i < alfanum.length; i++) {
            if (alfanum[i]%2 != 0) {
                System.out.print(alfanum[i] + " ");
            }
        }
    }
}
