package Programacion.Unidad_5.Ejercicios_De_Recorrido.ejercicio7;

import java.util.Scanner;

public class MultiplicacionF {
    public static int[] introducirArray(int n) {
        Scanner scn = new Scanner(System.in);
        int[] vector = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print((i + 1) + "ª variable: ");
            vector[i] = scn.nextInt();
        }
        return vector;
    }

    public static void imprimirMultiplicaion(int[] vector, int f) {
        for (int i = 0; i < vector.length; i++) {
            vector[i] = vector[i] * f;
            System.out.println((i + 1) + "ª variable: " + vector[i]);
        }
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int[] alfanum;
        int n, f;

        System.out.print("Cuantas variables planeas añadir: ");
        n = scn.nextInt();

        alfanum = introducirArray(n);

        System.out.print("Por cuanto los multiplicaras: ");
        f = scn.nextInt();

        imprimirMultiplicaion(alfanum, f);
    }
}
