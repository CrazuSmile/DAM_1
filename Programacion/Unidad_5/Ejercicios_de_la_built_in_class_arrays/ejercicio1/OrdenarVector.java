package Programacion.Unidad_5.Ejercicios_de_la_built_in_class_arrays.ejercicio1;

import java.util.Arrays;

public class OrdenarVector {
    public static void main(String[] args) {
        int[] vectorEntero = { 1, 2, 6, 8, 3 };
        Arrays.sort(vectorEntero);

        char[] vectorCaracter = { 's', 'g', 'r', 'c' };
        Arrays.sort(vectorCaracter);

        System.out.println("Vector de enteros ordenado: " + Arrays.toString(vectorEntero));
        System.out.println("Vector de caracteres ordenado: " + Arrays.toString(vectorCaracter));
    }
}
