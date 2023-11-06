package Programacion.Unidad_1.Ejercicios_1_3;

import java.util.Scanner;

public class Ejercicio9 {
    static double mediaArmonica(double num1, double num2) {
        return 2 / ((1 / num1) + (1 / num2));
    }

    public static void main(String[] args) {
        double x, y;
        Scanner lector = new Scanner(System.in);

        System.out.print("Introduce un valor: ");
        x = lector.nextDouble();
        System.out.print("Introduce un segundo valor: ");
        y = lector.nextDouble();

        System.out.println("la Media Armonica de los dos numeros es " + mediaArmonica(x, y));
    }
}
