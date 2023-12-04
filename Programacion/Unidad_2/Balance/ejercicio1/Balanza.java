package Programacion.Unidad_2.Balance.ejercicio1;

import java.util.Scanner;

public class Balanza {

    static void equilibrar() {
        System.out.println("Escriba el peso a equilibrar, en gramos");
        Scanner tcl = new Scanner(System.in);
        int peso = tcl.nextInt();
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
        System.out.println("Fin de la simulación de la balanza en " + numIntentos + " intentos");
    }

    public static void main(String[] args) {
        equilibrar();
    }
}