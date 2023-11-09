package Programacion.Unidad_2.Ejercicios.Ejercici_2_1.Ejercicio1;

public class Coche {
    enum TipoCoche {
        MINI, UTILITARIO, FAMILIAR, DEPORTIVO
    }

    enum Seguro {
        TERCEROS, A_TODO_RIESGO
    }

    private String modelo;
    private String color;
    private String matricula;
    private boolean pintura;
    private int año;
    private TipoCoche miCoche;
    private Seguro miSeguro;

    public String getModelo(){
        return modelo;
    }

    public void setModelo(String nombre){
        this.modelo = nombre;
    }

    public String getColor(){
        return color;
    }

    public void setColor(String color){
        this.color = color;
    }
}
