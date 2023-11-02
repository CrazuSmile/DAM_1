package Programacion.Unidad_1.Ejercicios_1_3;

import java.util.Scanner;

public class Ejercicio3 {
    static int mayor(int a, int b) {
        if (a > b) {
            return a;
        } else {
            return b;
        }
    }

    public static void main(String[] args) {
        int x, y;
        Scanner lector = new Scanner(System.in);
        System.out.print("Primer valor: ");
        x = lector.nextInt();
        System.out.print("Segundo valor: ");
        y = lector.nextInt();

        System.out.println("El mayor de los valores sera: " + mayor(x, y));
    }
}
