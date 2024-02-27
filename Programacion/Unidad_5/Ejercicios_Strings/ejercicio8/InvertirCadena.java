package Programacion.Unidad_5.Ejercicios_Strings.ejercicio8;

import java.util.Scanner;

public class InvertirCadena {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String frase;
        String fraseInvertida;

        System.out.print("Introduce una frase: ");
        frase = scn.nextLine();

        fraseInvertida = invertirCadena(frase);

        System.out.println("Frase invertida: " + fraseInvertida);

    }

    private static String invertirCadena(String cadena) {
        StringBuilder builder = new StringBuilder(cadena);

        builder.reverse();

        return builder.toString();
    }
}
