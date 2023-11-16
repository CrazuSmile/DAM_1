package Programacion.Unidad_2.Ejercicios.Ejercicio_2_1.POO.Ejercicio5;

public class Movil {
    private double x, y, velocidad, tiempo;

    Movil(double x, double y, double velocidad, double tiempo) {
        this.x = x;
        this.y = y;
        this.velocidad = velocidad;
        this.tiempo = tiempo;
    }

    public void movimiento(){
        y = 2*x + 1;
    }

}
