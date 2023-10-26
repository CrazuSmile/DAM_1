package Programacion.Unidad_1.Ejercicios_1_2.bucles;

public class Ejercicio3 {
    public static void main(String[] args) {
        int impar, par, multiCinco, count = 0;

        for (impar = 1; impar <= 99; impar = impar + 2) {
            System.out.print(impar + ", ");
            count++;
        }
        System.out.println("Hay " + count + " impares");
        System.out.println();
        count = 1;
        for (par = 2; par <= 100; par += 2) {
            System.out.print(par + ", ");
            count++;
        }
        System.out.println("Hay " + count + " pares");
        System.out.println();

        count = 1;
        for (multiCinco = 5; multiCinco <= 100; multiCinco += 5) {
            System.out.print(multiCinco + ", ");
            count++;
        }
        System.out.println("Hay "+count+" multiplos de 5");
    }
}
