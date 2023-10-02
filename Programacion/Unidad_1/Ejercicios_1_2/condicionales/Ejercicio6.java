package Programacion.Unidad_1.Ejercicios_1_2.condicionales;

import java.util.Scanner;

public class Ejercicio6 {

    public static void main(String[] args) {
        float cant;
        int mon2 = 0, mon1 = 0, cent50 = 0, cent20 = 0, cent10 = 0, cent5 = 0, cent2 = 0, cent1 = 0;
        Scanner lector = new Scanner(System.in);

        System.out.print("Introduce una cantidad: ");
        cant = lector.nextFloat();
        cant = cant * 100;
        if (cant > 0) {
            if (cant / 200 != 0) {
                mon2 = (int) cant / 200;
                cant = cant % 200;
            }
            if (cant / 100 != 0) {
                mon1 = (int) cant / 100;
                cant = cant % 100;
            }
            if (cant / 50 != 0) {
                cent50 = (int) cant / 50;
                cant = cant % 50;
            }
            if (cant / 20 != 0) {
                cent20 = (int) cant / 20;
                cant = cant % 20;
            }
            if (cant / 10 != 0) {
                cent10 = (int) cant / 10;
                cant = cant % 10;
            }
            if (cant / 5 != 0) {
                cent5 = (int) cant / 5;
                cant = cant % 5;
            }
            if (cant / 2 != 0) {
                cent2 = (int) cant / 2;
                cant = cant % 2;
            }
            if (cant / 1 != 0) {
                cent1 = (int) cant / 1;
                cant = cant % 1;
            }

            System.out.println("El cambio seria de: "+mon2+" monedas de 2€");
            System.out.println("El cambio seria de: "+mon1+" monedas de 1€");
            System.out.println("El cambio seria de: "+cent50+" monedas de 50 centimos");
            System.out.println("El cambio seria de: "+cent20+" monedas de 20 centimos");
            System.out.println("El cambio seria de: "+cent10+" monedas de 10 centimos");
            System.out.println("El cambio seria de: "+cent5+" monedas de 5 centimos");
            System.out.println("El cambio seria de: "+cent2+" monedas de 2 centimos");
            System.out.println("El cambio seria de: "+cent1+" monedas de 1 centimos");


        }
    }
}
