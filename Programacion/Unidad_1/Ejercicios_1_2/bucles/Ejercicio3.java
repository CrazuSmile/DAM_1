package Programacion.Unidad_1.Ejercicios_1_2.bucles;

public class Ejercicio3 {
    public static void main(String[] args) {
        int impar, par, multiCinco;

        for (impar = 1; impar <= 99; impar = impar + 2) {
            System.out.print(impar + ", ");
        }
        System.out.println();

        for (par = 2; par <= 100; par += 2) {
            System.out.print(par + ", ");
        }
        System.out.println();

        for (multiCinco = 5; multiCinco <= 100; multiCinco += 5) {
            System.out.print(multiCinco + ", ");

        }
    }
}
