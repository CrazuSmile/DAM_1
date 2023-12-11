package Programacion.Unidad_3.ejercicios.ejercicio1;

public class Hora{
    protected int hora;
    protected int minuto;

    Hora(int hora, int minuto){
        this.hora = hora;
        this.minuto = minuto;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return hora+":"+minuto;
    }
}
