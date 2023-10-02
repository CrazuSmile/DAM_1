package Programacion.Unidad_1.Ejercicios_1_2.condicionales;

import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        int edad;
        double descuento;
        boolean padres;
        Scanner lector = new Scanner(System.in);

        System.out.print("Edad del abonador: ");
        edad = lector.nextInt();

        if (edad >= 18 && edad <= 65) {
            System.out.println("Tiene que pagar un abono de 500€");
        } else {
            if (edad > 65) {
                descuento = 500 - (500 * 0.5);
                System.out.println(
                        "Posee un descuento de 50% por ser mayor de 65, por lo tanto debe abonar " + descuento + "€");
            }
            if (edad < 18) {
                System.out.print("¿Tus padres son miembros? ");
                padres = lector.nextBoolean();
                if (padres) {
                    descuento = 500 - (500 * 0.35);
                    System.out.println("Posee un descuento del 35% por tener padres miembros, por lo tanto debe abonar "
                            + descuento + "€");

                } else {
                    descuento = 500 - (500 * 0.25);
                    System.out.println("Posee un descuento del 25% por ser menor de edad, por lo tanto a de abonar "
                            + descuento + "€");
                }
            }
        }
    }
}
