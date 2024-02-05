package Programacion.Unidad_5.Ejercicios_De_Recorrido.ejercicio4;

import java.util.Scanner;

public class ImprimirEnMEnM {
    public static int[] introducirArray(int n) {
        Scanner scn = new Scanner(System.in);
        int[] alfanum = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print((i+1)+"ª variable: ");
            alfanum[i] = scn.nextInt();
        }
        return alfanum;
    }

    public static void imprimir(int[] array, int m){
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");

            if ((i + 1) % m == 0) {
                System.out.println();

            }
        }
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int[] alfanum;
        int n, m;

        System.out.print("Cuantas variables planeas añadir: ");
        n = scn.nextInt();
        
        System.out.print("En cuantas filas: ");
        m = scn.nextInt();

        alfanum = introducirArray(n);

        imprimir(alfanum, m);
    }
}
