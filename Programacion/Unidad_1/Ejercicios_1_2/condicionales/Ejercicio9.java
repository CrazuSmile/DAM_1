package Programacion.Unidad_1.Ejercicios_1_2.condicionales;

import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        int dia, mes, año;

        System.out.println("Intdroduce una fecha: ");
        System.out.print("Dia: ");
        dia = lector.nextInt();
        System.out.print("Mes: ");
        mes = lector.nextInt();
        System.out.print("Año: ");
        año = lector.nextInt();

        if ((año % 4 == 0) && (año % 100 != 0) || (año % 400 == 0)) {
            
        }
    }
}
