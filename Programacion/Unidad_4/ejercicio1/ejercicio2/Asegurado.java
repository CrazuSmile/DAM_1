package Programacion.Unidad_4.ejercicio1.ejercicio2;

import java.util.Calendar;

public class Asegurado {
    protected String nombre;
    protected String apellido1;
    protected String apellido2;
    protected int añoNacimiento;

    Asegurado(String nombre, String apellido1, String apellido2, int añoNacimiento) {
        this.nombre = nombre;
        this.apellido1 = apellido1;
        this.apellido2 = apellido2;
        this.añoNacimiento = añoNacimiento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido1() {
        return apellido1;
    }

    public void setApellido1(String apellido1) {
        this.apellido1 = apellido1;
    }

    public String getApellido2() {
        return apellido2;
    }

    public void setApellido2(String apellido2) {
        this.apellido2 = apellido2;
    }

    public int getAñoNacimiento() {
        return añoNacimiento;
    }

    public void setAñoNacimiento(int añoNacimiento) {
        this.añoNacimiento = añoNacimiento;
    }

    public int edad(int edad) {
        Calendar rightNow = Calendar.getInstance();
        edad = rightNow.get(Calendar.YEAR) - añoNacimiento;
        return edad;
    }

}
