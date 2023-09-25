import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        int segundosIn, segundosOut, minutos, minutosRes, horas, horasRes, dias;
        Scanner tcl = new Scanner(System.in);

        System.out.println("Introduce los segundos a calcualar: ");
        segundosIn = tcl.nextInt();

        minutos = segundosIn / 60;

        segundosOut = segundosIn % 60;

        horas = minutos / 60;

        dias = horas / 24;

        minutosRes = minutos % 60;

        horasRes = horas % 24;

        System.out.println("Seran: " + dias + " dias, " + horasRes + " horas, " + minutosRes + " minutos y "
                + segundosOut + " segundos");

    }
}
