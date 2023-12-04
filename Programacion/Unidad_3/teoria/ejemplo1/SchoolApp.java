package Programacion.Unidad_3.teoria.ejemplo1;

public class SchoolApp {
    public static void main(String[] args) {
        Alumno alumno1 = new Alumno();
        Persona persona1 = new Persona();
        Horario horario1 = new Horario();

        persona1.nombre = "Juan Jose";
        persona1.apellidos = "Sanz Lopez";
        persona1.añoDeNacimiento = 2000;

        persona1.imprime();

        alumno1.ponGrupo("Dog", null);
    }
}
