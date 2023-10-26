package Programacion.Unidad_1.Ejercicios_1_2.bucles;

import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {
        int contador = 2, numero;
        boolean primo = true;
        Scanner lector = new Scanner(System.in);

        System.out.print("Introduce un numero para comprobar si es primo: ");
        numero = lector.nextInt();

        while ((primo) && (contador != numero)) {
            if (numero % contador == 0)
                primo = false;
            contador++;
        }
        if (primo) {
            System.out.println("El numero " + numero + " es primo");

        } else {
            System.out.println("El numero " + numero + " no es primo");

        }

    }
}
