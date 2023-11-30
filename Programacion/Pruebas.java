package Programacion;

import java.util.Scanner;
import java.util.Random;

/**
 *
 * @author juasanlop2
 */
public class Pruebas {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        int usuario, i, cara = 0, cruz = 0;
        int valorAleatorio = random.nextInt(10) + 1;
        String moneda = "+o";
        System.out.print("Numero de lanzamientos ");
        usuario = tcl.nextInt();

        for (i = 1; i <= usuario; i++) {
            if (valorAleatorio == 1) {
                System.out.print("Moneda: " + moneda.charAt(valorAleatorio) + " ");
                cara++;
            } else {
                System.out.print("Moneda: " + moneda.charAt(valorAleatorio) + " ");
                cruz++;
            }
            valorAleatorio = random.nextInt(10) + 1;
        }
        System.out.print("Cara (+): " + cara + "\nCruz (o): " + cruz);
    }
}
