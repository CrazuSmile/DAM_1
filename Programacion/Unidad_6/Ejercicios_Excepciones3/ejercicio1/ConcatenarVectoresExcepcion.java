package Programacion.Unidad_6.Ejercicios_Excepciones3.ejercicio1;

import Programacion.utils.InputOutputArrayUtils;

public class ConcatenarVectoresExcepcion {

    public static void main(String[] args) {
        int[] array1 = InputOutputArrayUtils.inicializarArrayTeclado();
        int[] array2 = InputOutputArrayUtils.inicializarArrayTeclado();

        int[] resultado;
        try {
            resultado = concatenar(array1, array2);
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
            return;
        }
        
        InputOutputArrayUtils.imprimirArray(resultado);
    }

    private static int[] concatenar(int[] a, int[] b) {

        comprobar(a, b);

        int[] resultado = new int[a.length + b.length];

        for (int i = 0; i < resultado.length; i++) {
            resultado[i] = a[i];
        }

        for (int i = 0; i < resultado.length; i++) {
            resultado[a.length + i] = b[i];
        }
        return resultado;

    }

    private static void comprobar(int[] a, int[] b) {
        if (a == null || b == null || a.length == 0 || b.length == 0) {
            throw new IllegalArgumentException("Los vectores no pueden ser nulos o de tamaño 0");
        }
    }
}
