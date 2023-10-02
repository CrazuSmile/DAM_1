package Programacion.Unidad_1.Ejercicios_1_2.condicionales;

import java.util.Scanner;

public class Ejercicio6 {

    public static void main(String[] args) {
        float ingreso, cambio200euros, cambio100euros, cambio50euros, cambio20euros, cambio10euros,
                cambio5euros, cambio2euros, cambio1euro, cambio50cen, cambio20cen,
                cambio10cen, cambio5cen, cambio2cen, cambio1cen, resto;
        Scanner tcl = new Scanner(System.in);

        System.out.print("Introduce una cantidad a cambiar: ");
        ingreso = tcl.nextFloat();

        if (ingreso > 200) {
            cambio200euros = ingreso/200;
            resto = ingreso%200;
            if (resto >50) {
                
            }
            System.out.println("Seran "+cambio200euros+" billetes de 200€");

            
        } else if (ingreso > 100) {
            cambio100euros = ingreso/100;
            System.out.println("Seran "+cambio100euros+" billetes de 100€");
        }
        else if (ingreso > 50){
            cambio50euros = ingreso/50;
            System.out.println("Seran "+cambio50euros+" billetes de 50€");
        }
        else if (ingreso > 20){

        }
    }

}
