package ejercicios_avanzados.ejercicio5;

public class Participante implements Comparable<Participante> {

    private String nombre;
    private String apellidos;
    private Genero genero;
    private int dorsal;

    public Participante(String nombre, String apellidos, Genero genero, int dorsal) {
        if (nombre == null || apellidos == null || genero == null) {
            throw new IllegalArgumentException("Los participantes no pueden ser nulo.");
        }

        this.nombre = nombre;
        this.apellidos = apellidos;
        this.genero = genero;
        this.dorsal = dorsal;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public Genero getGenero() {
        return genero;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
    }

    public int getDorsal() {
        return dorsal;
    }

    public void setDorsal(int dorsal) {
        this.dorsal = dorsal;
    }

    @Override
    public int compareTo(Participante o) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'compareTo'");
    }

}
