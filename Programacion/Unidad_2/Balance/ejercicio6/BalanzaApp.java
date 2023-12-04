package Programacion.Unidad_2.Balance.ejercicio6;

import java.util.Scanner;

public class BalanzaApp {
    public static void main(String[] args) {
        Balanza balanza1 = new Balanza();
        Scanner tcl = new Scanner(System.in);

        System.out.println("Escriba el peso a equilibrar, en gramos");
        int peso = tcl.nextInt();
        balanza1.setPeso(peso);

        System.out.println("Fin de la simulación de la balanza en " + balanza1.equilibrar() + " intentos");
    }
}
