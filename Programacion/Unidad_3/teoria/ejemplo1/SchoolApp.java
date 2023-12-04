package Programacion.Unidad_3.teoria.ejemplo1;

public class SchoolApp {
    public static void main(String[] args) {
        Alumno alumno1 = new Alumno();

        alumno1.nombre = "Juan Jose";
        alumno1.apellidos = "Sanz Lopez";
        alumno1.añoDeNacimiento = 2000;

        alumno1.imprime();

        alumno1.ponGrupo("Dog", null);
    }
}
