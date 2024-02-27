package Programacion.Unidad_5.Ejercicios_Strings.ejercicio9;

import java.util.Scanner;

public class EliminarVocales {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        String nombreCompleto;
        String sinVocales;

        System.out.print("Introduzca su nombre completo: ");
        nombreCompleto = scn.nextLine();

        sinVocales = quitarString(nombreCompleto);

        System.out.println("Su nombre sin vocales: " + sinVocales);

    }

    private static String quitarString(String cadena) {
        StringBuilder noVocales = new StringBuilder();

        for (int i = 0; i < cadena.length(); i++) {
            char caracter = cadena.charAt(i);

            if (!esVocal(caracter)) {
                noVocales.append(caracter);
            }
        }
        return noVocales.toString();
    }

    private static boolean esVocal(char c) {
        char caracter = Character.toLowerCase(c);

        return caracter == 'a' || caracter == 'e' || caracter == 'i' || caracter == 'o' || caracter == 'u';
    }
}
