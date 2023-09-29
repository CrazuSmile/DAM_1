package Programacion.Unidad_1.Ejercicios_1_2.condicionales;

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        int num;
        Scanner tcl = new Scanner(System.in);

        System.out.print("Introduce un numero: ");
        num = tcl.nextInt();

        if ((num % 2) == 0) {
            System.out.println("El numero es par.");

        } else {
            System.out.println("El numero es impar.");
        }

    }
}
