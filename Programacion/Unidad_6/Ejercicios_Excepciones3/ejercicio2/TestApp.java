package Programacion.Unidad_6.Ejercicios_Excepciones3.ejercicio2;

import java.util.Scanner;

import ejercicio2.*;

public class TestApp {

    private static final Scanner TECLADO = new Scanner(System.in);

    public static void main(String[] args) {
        boolean leido = true;
        TrianguloEquilatero trianguloEquilatero1 = null;
        Punto punto1 = new Punto();
        Punto punto2 = new Punto();
        Punto punto3 = new Punto();
        do {
            try {
                System.out.print("Introduce la posicion X del primer punto: ");
                punto1.setX(Float.parseFloat(TECLADO.nextLine()));
                System.out.print("Introduce la posicion Y del primer punto: ");
                punto1.setY(Float.parseFloat(TECLADO.nextLine()));
                System.out.println("--------------------------------------");

                System.out.print("Introduce la posicion X del segundo punto: ");
                punto2.setX(Float.parseFloat(TECLADO.nextLine()));
                System.out.print("Introduce la posicion Y del segundo punto: ");
                punto2.setY(Float.parseFloat(TECLADO.nextLine()));
                System.out.println("--------------------------------------");

                System.out.print("Introduce la posicion X del tercer punto: ");
                punto3.setX(Float.parseFloat(TECLADO.nextLine()));
                System.out.print("Introduce la posicion Y del tercer punto: ");
                punto3.setY(Float.parseFloat(TECLADO.nextLine()));
                System.out.println("--------------------------------------");

                trianguloEquilatero1 = new TrianguloEquilatero(punto1, punto2, punto3);

                leido = false;
            } catch (Exception e) {
                // TODO: handle exception
                System.out.println("Error: " + e.getMessage());
                System.out.println();
            }
        } while (leido);

        System.out.println("El Triangulo equilatero que se ha creado es:\n" + trianguloEquilatero1.toString());

    }
}
