package Programacion.Unidad_5.Ejercicios_Strings.ejercicio4;

import java.util.Scanner;

public class CompararCadenas {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String primeraCadena;
        String segundaCadena;

        System.out.println(" ");

        System.out.print("Introduce una frase: ");
        primeraCadena = scn.nextLine();

        System.out.print("Introduce una segunda frase: ");
        segundaCadena = scn.nextLine();

        System.out.println(" ");
        comparar(primeraCadena, segundaCadena);

        System.out.println("");
    }

    private static void comparar(String primeraCadena, String segundaCadena) {
        if (primeraCadena.length() < segundaCadena.length()) {
            System.out.println(
                    "La segunda frase es mas grande, con una cantidad de " + segundaCadena.length() + " caracteres.");
        } else {
            System.out.println(
                    "La primera frase es mas grande, con una cantidad de " + primeraCadena.length() + " caracteres.");
        }
    }
}
