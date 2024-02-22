package Programacion.Unidad_5.EJERCICIOS_COMPLEJOS_DE_VECTORES.ejercicio1;

import java.util.Arrays;
import java.util.Scanner;

public class LlenarCubeta {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int capacidadInicial;
        int[] capacidad = new int[16];
        long lluviaDiaria = Math.round(Math.random() * 20);

        System.out.println("Escriba la capacidad de la cubeta, en litros: ");
        capacidadInicial = scn.nextInt();
        capacidad[0] = capacidadInicial;
        simulacion(capacidad, lluviaDiaria);

        System.out.println(Arrays.toString(capacidad));

    }

    private static void simulacion(int[] capacidad, long lluviaDiaria) {
        int numDiasTranscurridos;
        for (numDiasTranscurridos = 1; numDiasTranscurridos <= 15; numDiasTranscurridos++) {
            if (lluviaDiaria < capacidad[numDiasTranscurridos - 1]) {
                capacidad[numDiasTranscurridos] = (int) (capacidad[numDiasTranscurridos - 1] - lluviaDiaria);

            } else {
                capacidad[numDiasTranscurridos] = 0;
                break;
            }

            System.out.printf("\tDía=%d\tLluvia=%2d\tCapacidad=%3d\n", numDiasTranscurridos, lluviaDiaria,
                    capacidad[numDiasTranscurridos]);
            lluviaDiaria = Math.round(Math.random() * 20);
        }
        extracted(capacidad, lluviaDiaria, numDiasTranscurridos);
    }

    private static void extracted(int[] capacidad, long lluviaDiaria, int numDiasTranscurridos) {
        if (numDiasTranscurridos == 15) {
            System.out.printf("\tDía=%d\tLluvia=%2d\tCapacidad=%3d\n", numDiasTranscurridos, lluviaDiaria,
                capacidad[15]);
        }
        else {
            System.out.println("La cubeta esta llena.");
        }
    }
}
