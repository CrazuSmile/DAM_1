package Programacion.Unidad_5.Ejercicios_De_Recorrido.ejercicio5;

import java.util.Scanner;

public class SumaParesYImpares {
    public static int[] introducirArray(int n) {
        Scanner scn = new Scanner(System.in);
        int[] vector = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print((i + 1) + "ª variable: ");
            vector[i] = scn.nextInt();
        }
        return vector;
    }

    public static int sumarPares(int[] vector) {
        int suma = 0;

        for (int num : vector) {
            if (num % 2 == 0) {
                suma += num;
            }
        }
        return suma;
    }

    public static int sumarImpares(int[] vector) {
        int suma = 0;

        for (int num : vector) {
            if (num % 2 != 0) {
                suma += num;
            }
        }
        return suma;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int[] alfanum;
        int n;

        System.out.print("Cuantas variables planeas añadir: ");
        n = scn.nextInt();

        alfanum = introducirArray(n);

        System.out.println("La suma de los pares del vector es " + sumarPares(alfanum));
        System.out.println("la suma de los impares del vector es " + sumarImpares(alfanum));

    }

}
