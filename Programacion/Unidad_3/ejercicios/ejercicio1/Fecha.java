package Programacion.Unidad_3.ejercicios.ejercicio1;

public class Fecha {
    protected int dia;
    protected int mes;
    protected int año;

    Fecha(int dia, int mes, int año) {
        this.dia = dia;
        this.mes = mes;
        this.año = año;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return dia + "/" + mes + "/" + año;
    }
}
