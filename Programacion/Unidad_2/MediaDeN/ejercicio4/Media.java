package Programacion.Unidad_2.MediaDeN.ejercicio4;

import java.util.Scanner;

public class Media {

    private static int n = 0;
    private static float resultado = 0;

    static float media(int n) {
        Scanner tcl = new Scanner(System.in);
        float valor = 0;
        int i;
        for (i = 1; i <= n; i++) {
            resultado = resultado + valor;
            System.out.print("      Introduce el valor " + i + ": ");
            valor = tcl.nextFloat();
        }
        resultado = resultado + valor;
        resultado = resultado / i;
        return resultado;
    }

    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);

        System.out.println("¿Cuantos valores se van a introducir?");
        n = tcl.nextInt();

        resultado = media(n);

        System.out.println(" ");
        System.out.println("La media de los valores es: " + resultado);
    }
}
