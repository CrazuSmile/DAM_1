package Programacion.Unidad_3.ejercicios.ejercicio1;

import java.util.Scanner;

public class ExamenApp {
    public static void main(String[] args) {
        Examen examen1 = new Examen();
        Fecha fecha1 = new Fecha(24, 2, 2023);
        Hora hora1 = new Hora(12, 21);

        String siNo = "";
        boolean comprobar = true;
        int dia, mes, año, hora, minuto;

        Scanner tcl = new Scanner(System.in);

        examen1.setAsignatura("Programacion");
        examen1.setAula("Usos Multiples");

        System.out.println("El examen de la asigantura de " + examen1.getAsignatura() + " es en el aula "
                + examen1.getAula() + ", el dia " + fecha1.toString() + " a las " + hora1.toString());

        while (comprobar) {
            System.out.print("¿Quieres cambiar el dia y la hora? ");
            siNo = tcl.nextLine();
            if (siNo.equals("si") || siNo.equals("Si") || siNo.equals("SI") || siNo.equals("no") || siNo.equals("NO")
                    || siNo.equals("No")) {
                comprobar = false;

            }
        }

        if (siNo.equals("si") || siNo.equals("Si") || siNo.equals("SI")) {

            System.out.print("Dia: ");
            dia = tcl.nextInt();
            fecha1.setDia(dia);

            System.out.print("Mes: ");
            mes = tcl.nextInt();
            fecha1.setMes(mes);

            System.out.print("Año: ");
            año = tcl.nextInt();
            fecha1.setAño(año);

            System.out.print("Hora: ");
            hora = tcl.nextInt();
            hora1.setHora(hora);

            System.out.print("Minuto: ");
            minuto = tcl.nextInt();
            hora1.setMinuto(minuto);

            System.out.println("El examen de la asigantura de " + examen1.getAsignatura() + " es en el aula "
                    + examen1.getAula() + ", el dia " + fecha1.toString() + " a las " + hora1.toString());

        }

    }
}
