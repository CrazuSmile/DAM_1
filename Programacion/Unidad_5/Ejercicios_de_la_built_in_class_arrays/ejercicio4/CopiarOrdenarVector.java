package Programacion.Unidad_5.Ejercicios_de_la_built_in_class_arrays.ejercicio4;

import java.util.Arrays;

public class CopiarOrdenarVector {
    public static void main(String[] args) {

        double[] vectorOriginal = { 0.12, 12.09, 1234.543, 0.13 };

        double[] copia = Arrays.stream(vectorOriginal).sorted().toArray();

        System.out.println("Vector original " + Arrays.toString(vectorOriginal));
        System.out.println("Copia ordenada " + Arrays.toString(copia));
    }
}
