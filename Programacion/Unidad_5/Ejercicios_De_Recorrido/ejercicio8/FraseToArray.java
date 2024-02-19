package Programacion.Unidad_5.Ejercicios_De_Recorrido.ejercicio8;

import java.util.Scanner;

public class FraseToArray {
    public static void main(String[] args) {
        char[] arrayCarecteres = fraseArray();

        System.out.println("Frase como array de caracteres: " + new String(arrayCarecteres));
    }

    public static char[] fraseArray() {
        Scanner scn = new Scanner(System.in);

        String frase = scn.nextLine();

        return frase.toCharArray();
    }
}
