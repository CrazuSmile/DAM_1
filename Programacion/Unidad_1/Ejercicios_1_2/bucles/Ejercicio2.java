package Programacion.Unidad_1.Ejercicios_1_2.bucles;

public class Ejercicio2 {
    public static void main(String[] args) {
        int num = 1, i;

        for (i = 1; i < 1000; i++) {
            num += i;
            num++;
        }
        System.out.println("La suma de los numeros comprendidos entre 1 y 1000 es "+num);
    }
}
