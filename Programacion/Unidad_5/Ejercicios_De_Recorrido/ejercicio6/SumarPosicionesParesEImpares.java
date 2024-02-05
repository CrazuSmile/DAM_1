package Programacion.Unidad_5.Ejercicios_De_Recorrido.ejercicio6;

import java.util.Scanner;

public class SumarPosicionesParesEImpares {
    public static int[] introducirArray(int n) {
        Scanner scn = new Scanner(System.in);
        int[] vector = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print((i + 1) + "ª variable: ");
            vector[i] = scn.nextInt();
        }
        return vector;
    }

    public static int sumarPosicionesPares(int[] vector) {
        int suma = 0;

        for (int i = 0; i < vector.length; i += 2) {
            suma += vector[i];

        }
        return suma;
    }

    public static int sumarPosicionesImpares(int[] vector) {
        int suma = 0;

        for (int i = 1; i < vector.length; i += 2) {
            suma += vector[i];
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

        System.out.println("La suma de las posiciones pares del vector es " + sumarPosicionesPares(alfanum));
        System.out.println("la suma de las posiciones impares del vector es " + sumarPosicionesImpares(alfanum));
        System.out.println(
                "Y la diferencia entre ambos es " + (sumarPosicionesPares(alfanum) - sumarPosicionesImpares(alfanum)));

    }
}
