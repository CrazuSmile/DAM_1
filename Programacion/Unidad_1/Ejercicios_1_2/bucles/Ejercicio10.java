package Programacion.Unidad_1.Ejercicios_1_2.bucles;

import java.util.Random;

public class Ejercicio10 {
    public static void main(String[] args) {
        Random random = new Random();
        int valorAleatorio = random.nextInt(10) + 1;
        int contador;
        double porcentajeCara = 0, porcentajeCruz = 0;
        for (contador = 1; contador <= 1000000; contador++) {
            if (valorAleatorio % 2 == 0) {
                porcentajeCara = (contador * 100) / 1000000;
            } else {
                porcentajeCruz = 100 - porcentajeCara; 

            }
            valorAleatorio = random.nextInt(10)+1;
        }
        System.out.println("El porcentaje de veces que la moneda dara cara seran un " + porcentajeCara + "%");
        System.out.println("El porcentaje de veces que la moneda dara cruz seran un " + porcentajeCruz + "%");

    }
}
