package Programacion.Unidad_3.teoria.ejemplo2;

/**
 * Vehiculo
 */
public class Vehiculo {
    protected int velocidad;
    protected int ruedas;

    protected void parar() {
        velocidad = 0;
    }

    protected void acelerar(int kmh){
        velocidad += kmh;
    }
}