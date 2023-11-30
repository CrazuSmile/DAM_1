package Programacion.Unidad_2.SumatorioN.ejercicio1;

import java.util.Scanner;

public class Sumatorio {

    static void sumatorio() {
        Scanner tcl = new Scanner(System.in);
        int n = 0;
        float resultado = 0, valor = 0;

        System.out.println("¿Cuantos valores se van a introducir?");
        n = tcl.nextInt();

        for (int i = 1; i <= n; i++) {
            resultado = resultado + valor;
            System.out.print("      Introduce el valor " + i + ": ");
            valor = tcl.nextFloat();
        }
        resultado = resultado + valor;

        System.out.println(" ");
        System.out.println("El sumatorio de los valores es: " + resultado);
    }

    public static void main(String[] args) {
        sumatorio();
    }
}
