package Programacion.Unidad_1.Ejercicios_1_2.condicionales;

import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        float num1, num2;
        Scanner tcl = new Scanner(System.in);

        System.out.print("Introduce 2 numeros: ");
        num1 = tcl.nextFloat();
        num2 = tcl.nextFloat();

        if (num1 > num2) {
            System.out.println("El orden seria: " + num1 + ", " + num2);

        } else {
            System.out.println("El orden seria: " + num2 + ", " + num1);

        }
    }
}
