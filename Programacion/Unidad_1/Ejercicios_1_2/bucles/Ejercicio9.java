package Programacion.Unidad_1.Ejercicios_1_2.bucles;

import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args) {
        int numero, contador = 2, inicio;
        boolean primo = true;

        Scanner lector = new Scanner(System.in);

        System.out.print("Introduce un numero a factorizar: ");
        numero = lector.nextInt();

        while ((primo) && (contador != numero)) {
            if (numero % contador == 0)
                primo = false;
            contador++;
        }
        if (primo) {
            System.out.println(numero + " = " + numero + " * 1");

        } else {

            System.out.print(numero + " = ");

            for (inicio = 1; inicio <= numero; inicio++) {

                if (numero % inicio == 0) {
                    System.out.print(inicio);
                    numero /= inicio;
                    System.out.print(" * ");
                }
            }
            System.out.println(numero);

        }
    }
}
