package Programacion.Unidad_3.teoria.ejemplo1;

public class Persona {
    protected String nombre;
    protected String apellidos;
    protected int añoDeNacimiento;

    public void imprime() {
        System.out.println("Datos personales: " + nombre + " " + apellidos + " (" + añoDeNacimiento + ")");
    }
}
