package Programacion.Unidad_5.Ejercicios_De_Recorrido.ejercicio11;

import java.util.Scanner;

public class EquilibrioArray {
    public static int[] introducirArray(int n) {
        Scanner scn = new Scanner(System.in);
        int[] vector = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print((i + 1) + "ª variable: ");
            vector[i] = scn.nextInt();
        }
        return vector;
    }

    public static boolean veririficarEquilibrio(int[] vector) {
        int n = vector.length;

        if (n < 2) {
            return false;
        } else {
            double media1parte = media(vector, 0, n / 2);
            double media2parte = media(vector, n / 2, n);

            return media1parte == media2parte;
        }
    }

    public static double media(int[] vector, int inicio, int fin) {
        int suma = 0;
        int elementos = 0;

        for (int i = inicio; i < fin; i++) {
            suma += vector[i];
            elementos++;
        }
        return elementos > 0 ? (double) suma / elementos : 0;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int[] num;
        int n;

        System.out.print("Cuantas variables planeas añadir: ");
        n = scn.nextInt();

        num = introducirArray(n);

        boolean equilibrado = veririficarEquilibrio(num);

        if (equilibrado) {
            System.out.println("El vector es equilibrado");
        } else {
            System.out.println("El vector no esta equilibrado");
        }
    }
}
