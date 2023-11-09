package Programacion.Unidad_2.Ejercicios.Ejercici_2_1.Ejercicio2;

public class Carrera {
    private String nombre;
    private int codigo;
    private int curso;

    Carrera() {
        nombre = "Matematicas";
        codigo = 1017;
        curso = 1;
    }

    public void getAsignatura(String nomAsig, int codAsig, int curAsig) {
        nombre = nomAsig;
        codigo = codAsig;
        curso = curAsig;
    }
}
