package Programacion.Unidad_1.Ejercicios_1_3;

import java.util.Scanner;

public class Ejercicio6 {
    static void caracteres(String ejemplo, int veces) {
        int contador = 0;
        while (contador < veces) {
            System.out.println(ejemplo);
            contador++;
        }
    }

    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        String prueba;
        int cuanto;

        System.out.print("Escribe algo: ");
        prueba = lector.nextLine();
        System.out.print("Cuantas veces: ");
        cuanto = lector.nextInt();

        caracteres(prueba, cuanto);
    }
}
