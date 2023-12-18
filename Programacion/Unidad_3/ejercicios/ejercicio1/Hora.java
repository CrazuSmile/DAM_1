package Programacion.Unidad_3.ejercicios.ejercicio1;

public class Hora {
    protected int hora;
    protected int minuto;

    Hora(int hora, int minuto) {
        this.hora = hora;
        this.minuto = minuto;
    }

    public int getHora() {
        return hora;
    }

    public void setHora(int hora) {
        this.hora = hora;
    }

    public int getMinuto() {
        return minuto;
    }

    public void setMinuto(int minuto) {
        this.minuto = minuto;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return hora + ":" + minuto;
    }
}
