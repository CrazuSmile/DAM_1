package Programacion.Unidad_5.Ejercicios_Strings.ejercicio7;

import java.util.Scanner;

public class ContarEspacios {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String frase;

        System.out.print("Introduza una frase: ");
        frase = scn.nextLine();

        int contador = contadorEspacios(frase);

        System.out.println("La frase tiene " + contador + " espacios");

    }

    private static int contadorEspacios(String frase) {
        int contador = 0;

        for (int i = 0; i < frase.length(); i++) {
            if (frase.charAt(i) == ' ') {
                contador++;
            }

        }
        return contador;
    }
}
