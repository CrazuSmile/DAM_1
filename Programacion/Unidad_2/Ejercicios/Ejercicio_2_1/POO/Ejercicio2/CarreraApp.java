package Programacion.Unidad_2.Ejercicios.Ejercicio_2_1.POO.Ejercicio2;

import java.util.Scanner;

public class CarreraApp {
    public static void main(String[] args) {
        Carrera asignatura1 = new Carrera("Matematicas", 1017, 1);
        Carrera asignatura2 = new Carrera(null, 0, 0);

        String nomAsignatura;
        int numCod, numCur;

        Scanner tlc = new Scanner(System.in);

        System.out.println("La asignatura " + asignatura1.getNombre() + " del " + asignatura1.getCurso()
                + "º año del curso con el codigo " + asignatura1.getCodigo());

        System.out.print("Nombre de la asignatura: ");
        nomAsignatura = tlc.nextLine();
        System.out.print("Codido de la asignatura: ");
        numCod = tlc.nextInt();
        System.out.print("Año en el que se cursa: ");
        numCur = tlc.nextInt();

        asignatura2.setAsignatura(nomAsignatura, numCod, numCur);

        System.out.println("La asignatura " + asignatura2.getNombre() + " del " + asignatura2.getCurso()
                + "º año del curso  con el codigo " + asignatura2.getCodigo());
    }
}
