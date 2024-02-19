package Programacion.Unidad_5.Ejercicios_De_Recorrido.ejercicio9;

import java.util.Scanner;

public class InvertirArray {
    public static int[] introducirArray(int n) {
        Scanner scn = new Scanner(System.in);
        int[] vector = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print((i + 1) + "ª variable: ");
            vector[i] = scn.nextInt();
        }
        return vector;
    }

    public static int[] invertir(int[] vector) {
        int n = vector.length;
        int[] vectorInvertido = new int[n];

        for (int i = 0; i < n; i++) {
            vectorInvertido[i] = vector[n - 1 - i];
        }

        return vectorInvertido;
    }

    public static void imprimirArray(int[] vector) {
        for (int i = 0; i < vector.length; i++) {
            System.out.print(vector[i] + " ");
        }
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int[] num;
        int[] numInvertido;
        int n;

        System.out.print("Cuantas variables planeas añadir: ");
        n = scn.nextInt();

        num = introducirArray(n);

        numInvertido = invertir(num);

        System.out.print("El vector original: ");
        imprimirArray(num);

        System.out.println();

        System.out.print("El vector invertido: ");
        imprimirArray(numInvertido);
    }
}
