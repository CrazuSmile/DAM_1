package Programacion.Unidad_5.Ejercicios_de_la_built_in_class_arrays.ejercicio7;

import java.util.Arrays;
import java.util.Scanner;

public class ContarCotaIntroduzida {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        
        int tamaño, cota;

        System.out.print("Indique el tamaño del vector: ");
        tamaño = scn.nextInt();

        int[] vector = new int[tamaño];
        Arrays.fill(vector, scn.nextInt());
    }
}
