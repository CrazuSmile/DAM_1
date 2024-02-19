package Programacion.Unidad_5.Ejercicios_De_Recorrido.ejercicio12;

import java.util.Scanner;

public class PotenciasArray {
    public static double[] potencias(double base, int exponente) {
        double[] potencias = new double[exponente + 1];

        for (int i = 0; i <= exponente; i++) {
            potencias[i] = Math.pow(base, i);
        }

        return potencias;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        double base;
        int exponente;

        System.out.print("Introduce la base: ");
        base = scn.nextDouble();

        System.out.print("Introduce el exponente: ");
        exponente = scn.nextInt();

        double[] potencias = potencias(base, exponente);

        System.out.println("Potencias de " + base + " desde 0 hasta " + exponente + ":");
        for (int i = 0; i <= exponente; i++) {
            System.out.println(base + "^" + i + " = " + potencias[i]);
        }
    }
}
