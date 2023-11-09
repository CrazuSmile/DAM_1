package Programacion.Unidad_2.Ejercicios.Ejercici_2_1.Ejercicio2;

import java.util.Scanner;

public class Carrera {
    private String nombre;
    private int codigo;
    private int curso;

    Carrera() {
        nombre = "Matematicas";
        codigo = 1017;
        curso = 1;
    }

    public void setAsignatura(String nomAsig, int codAsig, int curAsig) {
        nombre = nomAsig;
        codigo = codAsig;
        curso = curAsig;
    }

    public String getNombre() {
        return nombre;
    }

    public int getCodigo() {
        return codigo;
    }

    public int curso() {
        return curso;
    }

    public static void main(String[] args) {
        Carrera carrera1 = new Carrera();
        String asignatura;
        int codigo, curso;
        Scanner lector = new Scanner(System.in);

        System.out.print("Nombre de la asignatura");
        asignatura = lector.nextLine();
        
        

        carrera1.setAsignatura(Asignatura, codigo, curso);

    }
}
