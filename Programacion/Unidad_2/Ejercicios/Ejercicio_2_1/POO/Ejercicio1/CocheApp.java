package Programacion.Unidad_2.Ejercicios.Ejercicio_2_1.POO.Ejercicio1;

import java.util.Scanner;

public class CocheApp {
    public static void main(String[] args) {
        Scanner tlc = new Scanner(System.in);

        Coche coche1 = new Coche();
        Coche coche2 = new Coche();

        String modelo, color;

        coche1.imprimirCoche();

        System.out.print("Modelo del coche: ");
        modelo = tlc.nextLine();
        coche2.setModelo(modelo);
        System.out.print("Color del coche: ");
        color = tlc.nextLine();
        coche2.setColor(color);

        System.out.println("Tu coche es un "+coche2.getModelo()+" de color "+coche2.getColor());



    }
}
