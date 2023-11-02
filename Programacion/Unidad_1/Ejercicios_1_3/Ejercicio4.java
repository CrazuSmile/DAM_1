package Programacion.Unidad_1.Ejercicios_1_3;

import java.util.Scanner;

public class Ejercicio4 {
    static int mayor(int a, int b) {
        if (a > b) {
            return a;
        } else {
            return b;
        }
    }

    static int mayor(int a, int b, int c) {
        int maxParcial = mayor(a, b);
        return mayor(maxParcial, c);
    }

    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        int x, y, z;
        System.out.print("Primer valor: ");
        x = lector.nextInt();
        System.out.print("Segundo valor: ");
        y = lector.nextInt();
        System.out.print("Tercer valor: ");
        z = lector.nextInt();

        System.out.println("El mayor valor es " + mayor(x, y, z));
    }
}
