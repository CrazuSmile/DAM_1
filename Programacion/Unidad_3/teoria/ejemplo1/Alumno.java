package Programacion.Unidad_3.teoria.ejemplo1;

public class Alumno extends Persona {
    private String grupo;
    private Horario horario;

    public void ponGrupo(String grupo, Horario horario){
        this.grupo = grupo;
        this.horario = horario;
    }

}
