package Programacion.Unidad_1.Ejercicios_1_2.condicionales;

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        int edad;
        Scanner tcl = new Scanner(System.in);

        System.out.println("¿Cuantos años tienes? ");

        edad = tcl.nextInt();

        if (edad >= 18) {
            System.out.println("Eres mayor de edad.");
        } else {
            System.out.println("Eres menor de edad.");
        }
    }
}
