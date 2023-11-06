package Programacion.Unidad_1.Ejercicios_1_3;

import java.util.Scanner;

public class Ejercicio11 {

    static void capicua(int num1, int num2, int num3, int num4, boolean esCapicua) {
        if (num1 == num4) {
            if (num2 == num3) {
                esCapicua = true;
            } else {
                esCapicua = false;
            }
        } else {
            esCapicua = false;
        }
    }

    public static void main(String[] args) {
        int a, b, c, d;
        Scanner lector = new Scanner(System.in);

        System.out.println("Introduce 4 valores: ");
        a = lector.nextInt();
        b = lector.nextInt();
        c = lector.nextInt();
        d = lector.nextInt();

        if (capicua(false)) {
            
        }

    }
}
