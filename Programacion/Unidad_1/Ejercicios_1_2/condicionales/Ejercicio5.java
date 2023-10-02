package Programacion.Unidad_1.Ejercicios_1_2.condicionales;

import java.util.Scanner;

public class Ejercicio5 {

    public static void main(String[] args) {
        int nota;
        Scanner tcl = new Scanner(System.in);

        System.out.print("Introduce una nota entre 0 a 10: ");
        nota = tcl.nextInt();

        if (0 <= nota && nota <= 10) {
            switch (nota) {
                case 0:
                case 1:
                case 2:
                    System.out.println(nota + "---> M.D.");
                    break;
                case 3:
                case 4:
                    System.out.println(nota + "---> INS.");
                    break;
                case 5:
                    System.out.println(nota + "---> SUF.");
                    break;
                case 6:
                    System.out.println(nota + "---> BIEN");
                    break;
                case 7:
                case 8:
                    System.out.println(nota + "---> NOT.");
                    break;
                case 9:
                case 10:
                    System.out.println(nota + "---> SOB.");
                    break;
                default:
                    System.out.println("No asistencia");
            }
        } else {
            System.out.println("Introduce un valor correcto");
        }

    }

}
