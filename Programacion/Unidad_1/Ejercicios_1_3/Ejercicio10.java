package Programacion.Unidad_1.Ejercicios_1_3;

import java.util.Scanner;

public class Ejercicio10 {
    static int factorial(int a) {
        int contador = a-1;
        while (contador > 1) {
            a = a * contador;
            contador--;
        }
        return a;
    }

    public static void main(String[] args) {
        int valor;
        Scanner lector = new Scanner(System.in);
        System.out.print("Introduce un valor: ");
        valor = lector.nextInt();

        System.out.println("El facorial del valor es "+factorial(valor));
    }
}
