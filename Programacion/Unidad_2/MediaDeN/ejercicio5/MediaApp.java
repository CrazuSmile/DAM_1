package Programacion.Unidad_2.MediaDeN.ejercicio5;

import java.util.Scanner;

public class MediaApp {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        Media media1 = new Media();
        int n;

        System.out.println("¿Cuantos valores para el sumatorio?");
        n = tcl.nextInt();
        media1.setN(n);

        media1.mediaN();

        System.out.println("El sumatorio de los "+media1.getN()+" valores es "+media1.getResultado());

    }
}
