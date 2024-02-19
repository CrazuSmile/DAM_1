package Programacion.Unidad_5.Ejercicios_de_la_built_in_class_arrays.ejercicio5;

import java.util.Arrays;

public class BusquedaCaracteres {
    public static void main(String[] args) {
        char[] vectorBusqueda = { 'a', 'v', 'ñ', 'm' };

        Arrays.sort(vectorBusqueda);
        System.out.println(Arrays.toString(vectorBusqueda));

        System.out.println("El caracter M esta en la posicion: " + Arrays.binarySearch(vectorBusqueda, 'm'));

    }
}
