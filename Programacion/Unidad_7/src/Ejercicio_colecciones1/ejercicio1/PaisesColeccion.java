package Ejercicio_colecciones1.ejercicio1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PaisesColeccion {

    private static final Scanner TECLADO = new Scanner(System.in);
    private static List<String> paises = new ArrayList<>();

    public static void main(String[] args) {
        int eleccion = 0;
        boolean leido = false;
        boolean salir = false;

        do {
            System.out.println(
                    "Bienvenido, ¿que deseas hacer? \n\t1. Añadir un pais.\n\t2. Consultar los paises.\n\t3. Eliminar un pais.\n\t4. Salir.");

            do {
                try {
                    System.out.print("Eleccion: ");
                    eleccion = Integer.parseInt(TECLADO.nextLine());
                    leido = true;

                } catch (IllegalArgumentException e) {
                    // TODO: handle exception
                    System.out.println("Introduce una eleccion valida.");
                    System.out.println();
                }
            } while (!leido);

            switch (eleccion) {
                case 1:
                    añadirPais();
                    break;

                case 2:
                    consutlarPais();
                    break;

                case 3:
                    eliminarPais();
                    break;
                case 4:
                    salir = true;
                    break;
                default:
                    break;
            }
        } while (!salir);

    }

    private static void añadirPais() {
        String nombrePais;
        System.out.print("Escribe el nombre del pais que desea añadir: ");
        nombrePais = TECLADO.nextLine();

        paises.add(nombrePais);
    }

    private static void consutlarPais() {
        System.out.print("¿Que pais desas consultar? ");
        int consulta = Integer.parseInt(TECLADO.nextLine());

        if (consulta < paises.size() && consulta >= 0) {
            System.out.println(paises.get(consulta));
        } else {
            System.out.println("No hay un pais en esa posicion.");
        }
    }

    private static void eliminarPais() {
        System.out.print("¿Que pais desas eliminar? ");
        int eliminacion = Integer.parseInt(TECLADO.nextLine());

        if (eliminacion < paises.size() && eliminacion >= 0) {
            paises.remove(eliminacion);
        } else {
            System.out.println("No hay un pais en esa posicion.");
        }
    }
}
