package Programacion.Unidad_1.Ejercicios_1_3;

import java.util.Scanner;

public class Ejercicio2 {
    static double area(double r, double PI) {
        return PI * r * r;
    }

    static double longitud(double r, double PI) {
        return 2 * PI * r;
    }

    public static void main(String[] args) {
        final double PI = 3.14;
        double radio;
        Scanner lector = new Scanner(System.in);
        
        System.out.print("Valor del radio: ");
        radio = lector.nextDouble();
        
        System.out.println("El area de la circunferencia es " + area(radio, PI) + " Y la longitud es " + longitud(radio, PI));
    }
}
