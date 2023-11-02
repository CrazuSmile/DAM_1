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
            if (mes >= 1 && mes <= 12){
                if (mes == 2){
                    if (dia >= 1 && dia <= 29) {
                        System.out.println("La fecha introducida es correcta.");
                    } else {
                        System.out.println("La fecha dada es incorrecta.");
                    }
                }
                if (mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12) {
                    if (dia >=1 && dia <=31) {
                        System.out.println("La fecha introducida es correcta.");
                    } else {
                        System.out.println("La fecha dada es incorrecta.");
                    }
                } else {
                    if (dia >=1 && dia <=30){
                        System.out.println("La fecha introducida es correcta.");
                    } else {
                        System.out.println("La fecha dada es incorrecta.");
                    }
                }
            } else {
                System.out.println("La fecha dada es incorrecta.");
            }
        } else {
            if (mes >= 1 && mes <= 12){
                if (mes == 2){
                    if (dia >= 1 && dia <= 28) {
                        System.out.println("La fecha introducida es correcta.");
                    } else {
                        System.out.println("La fecha dada es incorrecta.");
                    }
                }
                if (mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12) {
                    if (dia >=1 && dia <=31) {
                        System.out.println("La fecha introducida es correcta.");
                    } else {
                        System.out.println("La fecha dada es incorrecta.");
                    }
                } else {
                    if (dia >=1 && dia <=30){
                        System.out.println("La fecha introducida es correcta.");
                    } else {
                        System.out.println("La fecha dada es incorrecta.");
                    }
                }
            } else {
                System.out.println("La fecha dada es incorrecta.");
            }
        }
    }
}
