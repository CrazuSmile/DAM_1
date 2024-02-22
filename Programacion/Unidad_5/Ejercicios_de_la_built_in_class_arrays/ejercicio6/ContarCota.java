package Programacion.Unidad_5.Ejercicios_de_la_built_in_class_arrays.ejercicio6;

import java.util.Arrays;

public class ContarCota {
    public static void main(String[] args) {
        int[] vector = { 4, 8, 9, 2, 65, 1, 4 };
        int cota = 5;

        long contarMenor = Arrays.stream(vector).filter(element -> element <= cota).count();
        long contarMayor = Arrays.stream(vector).filter(element -> element >= cota).count();

        System.out.println("Total de numeros menores a la cota: " + contarMenor);
        System.out.println("Total de numeros mayores a la cota: " + contarMayor);
    }
}
