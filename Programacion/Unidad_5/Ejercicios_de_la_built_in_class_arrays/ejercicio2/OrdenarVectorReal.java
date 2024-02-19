package Programacion.Unidad_5.Ejercicios_de_la_built_in_class_arrays.ejercicio2;

import java.util.Arrays;

public class OrdenarVectorReal {
    public static void main(String[] args) {
        float[] vectorReal = { 3.2f, 54.35f, 127.7843f, 0.454f , 0.455f};
        Arrays.sort(vectorReal);

        System.out.println("Vector de reales ordenado: " + Arrays.toString(vectorReal));
    }
}
