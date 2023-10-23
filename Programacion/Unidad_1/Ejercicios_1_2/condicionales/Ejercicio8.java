package Programacion.Unidad_1.Ejercicios_1_2.condicionales;

import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {
        int diaN, mesN, añoN, diaA, mesA, añoA, edad;
        Scanner lector = new Scanner(System.in);

        System.out.println("Introduce fecha de naciemiento ");
        System.out.print("Dia: ");
        diaN = lector.nextInt();
        System.out.print("Mes: ");
        mesN = lector.nextInt();
        System.out.print("Año: ");
        añoN = lector.nextInt();

        System.out.println("Introduce fecha actual: ");
        System.out.print("Dia: ");
        diaA = lector.nextInt();
        System.out.print("Mes: ");
        mesA = lector.nextInt();
        System.out.print("Año: ");
        añoA = lector.nextInt();

        if (mesA > 0 && mesA < 13 && mesN > 0 && mesN < 13) {
            if (diaA > 0 && diaA <= 31 && diaN > 0 && diaN <= 31) {
                if (diaA >= diaN && mesA >= mesN) {
                    edad = añoA - añoN;
                    System.out.println("Tu edad es de " + edad + " año");
                } else {
                    edad = añoA - (añoN + 1);
                    System.out.println("Tu edad es de " + edad + " año");

                }
            } else {
                System.out.println("Introduce un dia correcto");
            }
        } else {
            System.out.println("Introduce un mes correcto");
        }
    }
}
