package Programacion.Unidad_5.Ejercicios_de_la_built_in_class_arrays.ejercicio3;

import java.util.Arrays;

public class CopiaVector {

    public static void main(String[] args) {
        String[] vectorOriginal = { "hola", "que", "tal" };

        String[] vectorCopia = Arrays.copyOf(vectorOriginal, vectorOriginal.length);

        System.out.println("Vector Original: " + Arrays.toString(vectorOriginal));
        System.out.println("Vector Copia: " + Arrays.toString(vectorCopia));
    }
}
