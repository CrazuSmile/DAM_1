package Programacion.Unidad_2.Balance.ejercicio3;

import java.util.Scanner;

public class Balanza {

    static int equilibrar(int peso) {

        int numIntentos = 0;
        while (peso > 0) {
            numIntentos++;
            long pesoIntento = Math.round(Math.random() * 100);

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
        int peso = tcl.nextInt();

        System.out.println("Fin de la simulación de la balanza en " + equilibrar(peso) + " intentos");
    }
}