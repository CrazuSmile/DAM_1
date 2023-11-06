package Programacion.Unidad_1.Ejercicios_1_3;

import java.util.Scanner;

public class Ejercicio12 {
    static void saluda(String nombre, String idioma) {
        switch (idioma) {
            case "a":
                System.out.println("Bon dia, " + nombre);
                break;
            case "b":
                System.out.println("Buenos dias, " + nombre);
                break;
            case "c":
                System.out.println("Good morning, " + nombre);
                break;
        }
    }

    public static void main(String[] args) {
        String tuNombre, eleccion;
        boolean comprobar = true;
        Scanner teclado = new Scanner(System.in);

        System.out.print("Escribe tu nombre: ");
        tuNombre = teclado.nextLine();

        System.out.println("Escoge un idioma: ");
        System.out.println("(a) Valenciano.");
        System.out.println("(b) Castellano.");
        System.out.println("(c) Ingles.");
        while (comprobar) {
            eleccion = teclado.nextLine();
            if (eleccion.equals("a") || eleccion.equals("b") || eleccion.equals("c")) {
                comprobar = false;
                saluda(tuNombre, eleccion);                
            } else {
                comprobar = true;
                System.out.println("Escoge un idioma disponible.");
            }
        }
    }
}
