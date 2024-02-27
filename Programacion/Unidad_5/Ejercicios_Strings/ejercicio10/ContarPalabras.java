package Programacion.Unidad_5.Ejercicios_Strings.ejercicio10;

import java.util.Scanner;

public class ContarPalabras {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        String frase, palabra;
        int contador;

        System.out.print("Introduzca una frase: ");
        frase = scn.nextLine();

        System.out.print("Introduzca la palabra a buscar: ");
        palabra = scn.nextLine();

        contador = contarPalabrasDeUnaFrase(frase, palabra);

        System.out.println("La palabra '" + palabra + "' aparece " + contador + " veces");

    }

    private static int contarPalabrasDeUnaFrase(String cadena, String palabra) {
        String[] palabras = cadena.split("\\s+");

        int contador = 0;

        for (String palabraFrase : palabras) {
            if (palabraFrase.equalsIgnoreCase(palabra)) {
                contador++;
            }
        }
        return contador;
    }
}
