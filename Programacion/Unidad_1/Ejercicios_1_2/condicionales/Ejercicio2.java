package Programacion.Unidad_1.Ejercicios_1_2.condicionales;

import java.util.Scanner;

public class Ejercicio2 {

    public static void main(String[] args) {
        int edad;
        Scanner tcl = new Scanner(System.in);

        System.out.println("¿Cuantos años tienes? ");

        edad = tcl.nextInt();

        if (edad > 25) {
            System.out.println("Eres mayor de 25 años.");

        }

        else {
            if (edad < 25) {
                System.out.println("Eres menor de 25 años.");
            } else {
                System.out.println("Tienes 25 años");
            }

        }
    }
}
