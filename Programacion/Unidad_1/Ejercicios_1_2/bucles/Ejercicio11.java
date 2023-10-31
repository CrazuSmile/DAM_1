package Programacion.Unidad_1.Ejercicios_1_2.bucles;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio11 {
    public static void main(String[] args) {
        Random random = new Random();
        int adivinar = random.nextInt(100) + 1;
        int usuario = 0, i = 0;
        Scanner lector = new Scanner(System.in);

        while (usuario != adivinar) {
            System.out.print("Introduce un numero entre 1 a 100 para adivinar: ");
            usuario = lector.nextInt();
            if (usuario == (int) usuario) {
                if (usuario > 0 && usuario <= 100) {
                    if (usuario > adivinar) {
                        System.out.println("El numero introducido es mas grande al numero a adivinar");
                    } else {
                        System.out.println("El numero introducido es menor al numero a adivinar");
                    }
                    i++;
                } else {
                    System.out.println("Introduce un valor correcto.");

                }
            } else {
                System.out.println("Introduce un valor correcto.");
            }

        }
        System.out
                .println("Muy bien lo has acertado, el numero es " + usuario + " y has necesitado " + i + " intentos");
    }

}
