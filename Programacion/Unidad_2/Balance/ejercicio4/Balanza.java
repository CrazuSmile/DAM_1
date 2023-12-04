package Programacion.Unidad_2.Balance.ejercicio4;

import java.util.Scanner;

public class Balanza {

    private static int peso;
    private static long pesoIntento;
    private static int numIntentos;


    static int equilibrar(int peso) {

        numIntentos = 0;
        while (peso > 0) {
            numIntentos++;
            pesoIntento = Math.round(Math.random() * 100);

            peso -= pesoIntento;
            System.out.printf("\tIntento=%d\tPeso añadido=%2d\tQueda por equilibrar=%3d\n", numIntentos, pesoIntento,
                    peso);
            if (peso == 0)
                System.out.println("Peso balanceado");

        }
        return numIntentos;
    }

    public static void main(String[] args) {
        System.out.println("Escriba el peso a equilibrar, en gramos");

        Scanner tcl = new Scanner(System.in);
        peso = tcl.nextInt();

        System.out.println("Fin de la simulación de la balanza en " + equilibrar(peso) + " intentos");
    }
}