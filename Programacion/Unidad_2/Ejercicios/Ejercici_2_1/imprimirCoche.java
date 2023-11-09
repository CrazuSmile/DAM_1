package Programacion.Unidad_2.Ejercicios.Ejercici_2_1;

import java.util.Scanner;

public class imprimirCoche {
    public static void main(String[] args) {
        String modelo, color;
        boolean metalico;
        Coche coche1 = new Coche();

        Scanner teclado = new Scanner(System.in);

        System.out.print("Dime el modelo del coche: ");
        modelo = teclado.nextLine();

        System.out.print("De que color: ");
        color = teclado.nextLine();

        System.out.print("Es metalizado: ");
        metalico = teclado.nextBoolean();

        coche1.imprimeCoche(modelo, color, metalico);

    }
}
