package Programacion.Unidad_2.Ejercicios.Ejercicio_2_1.Ejercicio2;

public class Carrera {
    private String nombre;
    private int codigo;
    private int curso;

    Carrera(String nombre, int codigo, int curso) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.curso = curso;
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

    public int getCurso() {
        return curso;
    }
}
