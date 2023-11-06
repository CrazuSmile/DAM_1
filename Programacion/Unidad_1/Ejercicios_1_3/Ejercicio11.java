package Programacion.Unidad_1.Ejercicios_1_3;

import java.util.Scanner;

public class Ejercicio11 {

    static void capicua(int num1, int num2, int num3, int num4) {
        if (num1 == num4) {
            if (num2 == num3) {
                System.out.println("Es capicua.");
            } else {
                System.out.println("No es capicua.");
            }
        } else {
            System.out.println("No es capicua.");
        }
    }

    public static void main(String[] args) {
        int a, b, c, d;
        boolean comprobar = true;
        Scanner lector = new Scanner(System.in);
        while (comprobar) {
            System.out.println("Introduce 4 valores: ");
            a = lector.nextInt();
            b = lector.nextInt();
            c = lector.nextInt();
            d = lector.nextInt();

            if (a >= 0 && a < 10 && b >= 0 && b < 10 && c >= 0 && c < 10 && d >= 0 && d < 10) {
                comprobar = false;
                capicua(a, b, c, d);
            } else{
                comprobar = true;
                System.out.println("Introduce un valor aceptable.");
            }
        }
        
    }
}
