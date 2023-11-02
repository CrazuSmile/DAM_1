package Programacion.Unidad_1.Ejercicios_1_3;

import java.util.Scanner;

public class Ejercicio1 {
    static int suma(int a, int b) {
        Scanner lector = new Scanner(System.in);
        System.out.print("Primer valor: ");
        a = lector.nextInt();
        System.out.print("Segundo valor: ");
        b = lector.nextInt();
        return a + b;
    }

    public static void main(String[] args) {
        System.out.println("La suma de ambos numeros es: "+suma(0, 0));
    }
}
